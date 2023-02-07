package com.genspark.joindemo.controller;

import com.genspark.joindemo.DTO.StudentResponse;
import com.genspark.joindemo.VO.ResponseTemplateVO;
import com.genspark.joindemo.entity.APCourse;
import com.genspark.joindemo.entity.Student;
import com.genspark.joindemo.repository.AddressRepository;
import com.genspark.joindemo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student/api")
@Slf4j
public class StudentController {
    @Autowired
    StudentService studentService;
    @Autowired
    private AddressRepository addressRepository;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        log.info("Inside createStudent method of StudentController");
        return studentService.createStudent(student);
    }
    @GetMapping("/all")
    public List<Student> viewAllStudent()
    {
        log.info("Inside viewAllStudent method of StudentController");
        return studentService.viewAllStudents();
    }
    @GetMapping("/city/{city}")
    public List<StudentResponse> getByCity(@PathVariable("city") String city){
        log.info("Inside getByCity method of StudentController");
        List<Student> studentList=studentService.getByCity(city);
        List<StudentResponse> studentResponseList=new ArrayList<StudentResponse>();
        studentList.stream().forEach(student->{
            studentResponseList.add(new StudentResponse(student));
        });
        return studentResponseList;
    }
//    @GetMapping("course/{course}")
//    public List<Student> getByCourse(@PathVariable String course){
//        List<Student> studentsList=studentService.getByCourse(course);
//        return studentsList;
//    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getStudentsWithGrades(@PathVariable("id") Integer studentId){
        log.info("Inside getStudentsWithGrades method of StudentController");
        return studentService.getStudentWithGrades(studentId);
    }
}
