package com.inTimeTec.reimbursementApplication.Dao;

import com.inTimeTec.reimbursementApplication.Entity.Reimbursement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ReimbursementDao extends JpaRepository<Reimbursement,Integer> {


    @Query(value = "SELECT * FROM tbl_reimbursements WHERE emp_id = ?1", nativeQuery = true)
 //   @Query("FROM reimbursement WHERE emp_id = ?1")
    List<Reimbursement> findReimById(int empId);

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "UPDATE myschema.tbl_reimbursements r SET r.reim_status = ?2 WHERE r.reim_id = ?1", nativeQuery = true)
    void updateReimById(int reimId, String status);

    @Query(value = "SELECT * FROM tbl_reimbursements WHERE reim_status = ?1", nativeQuery = true)
    List<Reimbursement> getReimByStatus(String status);

    @Query(value = "SELECT emp_id FROM tbl_reimbursements WHERE reim_id = ?1", nativeQuery = true)
    int getEmpIdByReimId(int reimId);
}
