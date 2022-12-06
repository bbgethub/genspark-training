package com.genspark.SpringBootEmpDemo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genspark.SpringBootEmpDemo.DAO.EmployeeDAO;
import com.genspark.SpringBootEmpDemo.Entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	List<Employee> employee;
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public List<Employee> getAllEmployee() {
		return this.employeeDAO.findAll();
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		Employee emp=null;
		Optional<Employee> e=this.employeeDAO.findById(employeeId);
			if(e.isPresent())
				emp=e.get();
			else
				throw new RuntimeException("Couser not found or this id:"+employeeId);
		return emp;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		return this.employeeDAO.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return this.employeeDAO.save(emp);
	}

	@Override
	public String deleteEmployee(int employeeId) {
		this.employeeDAO.deleteById(employeeId);
		return "Deleted Successfully";
	}


}
