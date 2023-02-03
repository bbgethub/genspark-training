package com.inTimeTec.reimbursementApplication.Service;

import com.inTimeTec.reimbursementApplication.Dao.EmployeeDao;
import com.inTimeTec.reimbursementApplication.Entity.Employee;
import com.inTimeTec.reimbursementApplication.Entity.Reimbursement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    public EmployeeDao employeeDao;

    @Override
    public List<Employee> getEmployees() {
        return this.employeeDao.findAll();
    }

    @Override
    public Employee getEmployee(int empId) {
        Optional<Employee> e = this.employeeDao.findById(empId);
        Employee emp = null;
        if(e.isPresent()){
            emp = e.get();
        }
        else{
            throw new RuntimeException("Employee not found for given ID :: " + empId);
        }
        return emp;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return this.employeeDao.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return this.employeeDao.save(employee);
    }

    @Override
    public String deleteEmployee(int empId) {
        this.employeeDao.deleteById(empId);
        return "Employee deleted successfully";
    }

    @Override
    public String getEmpIdByName(String eName) {
        return this.employeeDao.getEmployeeIDByName(eName);
    }

    @Override
    public String getEmailByEmpID(int empId) {
        return this.employeeDao.getEmail(empId);
    }

}
