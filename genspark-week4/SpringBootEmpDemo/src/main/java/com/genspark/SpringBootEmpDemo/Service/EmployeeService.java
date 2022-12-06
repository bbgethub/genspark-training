package com.genspark.SpringBootEmpDemo.Service;

import java.util.List;

import com.genspark.SpringBootEmpDemo.Entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	Employee getEmployeeById(int employeeId);
	Employee addEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	String deleteEmployee(int employeeId);

}
