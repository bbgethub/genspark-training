package com.genspark.SpringBootEmpDemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.genspark.SpringBootEmpDemo.Entity.Employee;
import com.genspark.SpringBootEmpDemo.Service.EmployeeService;

@RestController
public class MyController {

@Autowired
private EmployeeService employeeService;

@RequestMapping("/")
public String home()
{
	return "<HTML><H1>Welcome to Employee Demo</H1></HTML>";
}

@GetMapping("/employees")
public List<Employee> getEmployees()
{
	return employeeService.getAllEmployee();
	
}
@GetMapping("/employee/{empId}")
public Employee getEmployeeDetails(@PathVariable String empId)
{
	return this.employeeService.getEmployeeById(Integer.parseInt(empId));
}

@PostMapping("/employees")
public Employee addCourse(@RequestBody Employee emp)
{
	return this.employeeService.addEmployee(emp);
	
}
@PutMapping("/employess/{empId}")
public Employee updateCourse(@RequestBody Employee emp)
{
	return this.employeeService.updateEmployee(emp);
}

@DeleteMapping("/employess/{empId}")
public String deleteCourse(@PathVariable String empId)
{
	return this.employeeService.deleteEmployee(Integer.parseInt(empId));
}
}
