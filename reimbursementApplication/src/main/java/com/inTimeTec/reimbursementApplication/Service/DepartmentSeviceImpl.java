package com.inTimeTec.reimbursementApplication.Service;

import com.inTimeTec.reimbursementApplication.Dao.DepartmentDao;
import com.inTimeTec.reimbursementApplication.Entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentSeviceImpl implements DepartmentService{

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public List<Department> getDepartments() {
        return this.departmentDao.findAll();
    }

    @Override
    public Department getDepartment(int deptID) {

        Optional<Department> c = this.departmentDao.findById(deptID);
        Department dept = null;
        if (c.isPresent()) {
            dept = c.get();
        } else {
            throw new RuntimeException(" Department not found for the given ID :: " + deptID);
        }
        return dept;
        //return this.departmentDao.getById(deptID);

    }

    @Override
    public Department addDepartment(Department department)
    {
        return this.departmentDao.save(department);
    }

    @Override
    public Department updateDepartment(Department department) {
        return this.departmentDao.save(department);
    }

    @Override
    public String deleteDepartment(int deptID) {
        departmentDao.deleteById(deptID);
        return "Department Deleted Successsfully";
    }
}
