package com.genspark.SpringBootEmpDemo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees_tbl")
public class Employee {

	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE)
	int employeeId;
	String employeeName;
	String employeeEmail;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public Employee(String employeeName, String employeeEmail) {
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
	}
	public Employee() {
		
	}
	
}
