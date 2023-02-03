package com.inTimeTec.reimbursementApplication.Service;

import com.inTimeTec.reimbursementApplication.Entity.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> getDepartments();
    Department getDepartment(int deptID);
    Department addDepartment(Department department);
    Department updateDepartment(Department department);
    String deleteDepartment(int deptID);
}
