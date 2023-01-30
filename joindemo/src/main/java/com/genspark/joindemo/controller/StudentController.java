package com.genspark.joindemo.controller;

import com.genspark.joindemo.DTO.StudentResponse;
import com.genspark.joindemo.entity.Student;
import com.genspark.joindemo.repository.AddressRepository;
import com.genspark.joindemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student/api")
public class StudentController {
    @Autowired
    StudentService studentService;
    @Autowired
    private AddressRepository addressRepository;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
    @GetMapping("/all")
    public List<Student> viewAllStudent()
    {
        return studentService.viewAllStudents();
    }
    @GetMapping("/{city}")
    public List<StudentResponse> getByCity(@PathVariable String city){
        List<Student> studentList=studentService.getByCity(city);
        List<StudentResponse> studentResponseList=new ArrayList<StudentResponse>();
        studentList.stream().forEach(student->{
            studentResponseList.add(new StudentResponse(student));
        });
        return studentResponseList;
    }
}
