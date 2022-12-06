package com.genspark.SpringBootEmpDemo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.genspark.SpringBootEmpDemo.Entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	List<Employee> employee;
	

	public EmployeeServiceImpl() {
		employee=new ArrayList();
		employee.add(new Employee(1001,"AAAA","aaaa@gmail.com"));
		employee.add(new Employee(1002,"BBBB","bbbb@gmail.com"));
		employee.add(new Employee(1003,"CCCC","cccc@gmail.com"));
		employee.add(new Employee(1004,"DDDD","dddd@gmail.com"));
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employee;
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		System.out.println("Inside  Employee getEmployeeById(int employeeId)@@@@@@@@@");
		Employee emp=null;
		for(Employee e:employee)
		{
			if(e.getEmployeeId()==employeeId)
			{
				emp=e;
				break;
			}
		}
		return emp;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		employee.add(emp);
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		String name=emp.getEmployeeName();
		String email=emp.getEmployeeEmail();
		Employee e=null;
		for(Employee emp1:employee)
		{
			if(emp1.getEmployeeId()==emp.getEmployeeId())
			{
				emp1.setEmployeeEmail(email);
				emp1.setEmployeeName(name);
				e=emp;
				break;
			}
		}
		return e;
	}

	@Override
	public String deleteEmployee(int employeeId) {
		for(Employee emp:employee)
		{
			if(emp.getEmployeeId()==employeeId)
			{
				employee.remove(emp);
				break;
			}
		}
		return "Deleted Successfully";
	}


}
