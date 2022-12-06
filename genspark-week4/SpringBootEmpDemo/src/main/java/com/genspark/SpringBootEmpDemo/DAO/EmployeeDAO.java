package com.genspark.SpringBootEmpDemo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.genspark.SpringBootEmpDemo.Entity.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee,Integer> {

}
