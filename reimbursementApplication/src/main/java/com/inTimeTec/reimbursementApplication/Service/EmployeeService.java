package com.inTimeTec.reimbursementApplication.Service;

import com.inTimeTec.reimbursementApplication.Entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    List<Employee> getEmployees();
    Employee getEmployee(int empId);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    String deleteEmployee(int empId);
    String getEmpIdByName(String eName);
    String getEmailByEmpID(int empId);
}
