package com.inTimeTec.reimbursementApplication.Dao;

import com.inTimeTec.reimbursementApplication.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectDao extends JpaRepository<Project,Integer> {
}
