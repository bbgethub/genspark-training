package com.inTimeTec.reimbursementApplication.Controller;

import com.inTimeTec.reimbursementApplication.Entity.Employee;
import com.inTimeTec.reimbursementApplication.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String emp()
    {
        return "<HTML><H1>Welcome to Employee Page</H1></HTML>";
    }

    @GetMapping("/employee")
    public List<Employee> getEmployee()
    {
        return this.employeeService.getEmployees();
    }

    @GetMapping("/employee/{empID}")
    public Employee getEmployee(@PathVariable String empID)
    {
        return this.employeeService.getEmployee(Integer.parseInt(empID));
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return this.employeeService.addEmployee(employee);
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        return this.employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employee/{empID}")
    public String deleteEmployee(@PathVariable String empID)
    {
        return this.employeeService.deleteEmployee(Integer.parseInt(empID));
    }

}



