package com.inTimeTec.reimbursementApplication.Dao;


import com.inTimeTec.reimbursementApplication.Entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerDao extends JpaRepository<Manager,Integer> {
}
