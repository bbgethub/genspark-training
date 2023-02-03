package com.inTimeTec.reimbursementApplication.Dao;

import com.inTimeTec.reimbursementApplication.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {

    @Query(value = "Select e_password from tbl_employees where e_email = ?1", nativeQuery = true)
    String getPassword(String email);

    @Query(value = "Select e_id from tbl_employees where e_name = ?1", nativeQuery = true)
    String getEmployeeIDByName(String eName);

    @Query(value = "Select e_email from tbl_employees where e_id = ?1", nativeQuery = true)
    String getEmail(int eId);
}
