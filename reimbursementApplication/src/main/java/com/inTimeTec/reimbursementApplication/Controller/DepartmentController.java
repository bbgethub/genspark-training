package com.inTimeTec.reimbursementApplication.Controller;

import com.inTimeTec.reimbursementApplication.Entity.Department;
import com.inTimeTec.reimbursementApplication.Service.Authentication;
import com.inTimeTec.reimbursementApplication.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private Authentication authentication;

    @GetMapping("/")
    public String dept()
    {
        return "<HTML><H1>Welcome to Dept Page</H1></HTML>";
    }

//    @GetMapping("/dept/{email}/{pass}")
//    public List<Department> getDepartments(@PathVariable String email,@PathVariable String pass) {
//        if (this.authentication.checkCredentials(email, pass) == 1) {
//            return this.departmentService.getDepartments();
//        } else
//        {
//            return null;
//        }
//    }

    @GetMapping("/depts/")
    public List<Department> getDepartments() {
        return this.departmentService.getDepartments();
    }

    @GetMapping("/dept/{deptID}")
    public Department getDepartment(@PathVariable String deptID)
    {
        return this.departmentService.getDepartment(Integer.parseInt(deptID));
    }

    @PostMapping("/dept")
    public Department addDepartment(@RequestBody Department department)
    {
        return this.departmentService.addDepartment(department);
    }

    @PutMapping("/dept")
    public Department updateDepartment(@RequestBody Department department)
    {
        return this.departmentService.updateDepartment(department);
    }

    @DeleteMapping("/dept/{deptID}")
    public String deleteDepartment(@PathVariable String deptID)
    {
        return this.departmentService.deleteDepartment(Integer.parseInt(deptID));
    }


}
