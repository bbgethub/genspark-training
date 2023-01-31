package com.genspark.joindemo.controller;

import com.genspark.joindemo.entity.APCourse;
import com.genspark.joindemo.entity.Student;
import com.genspark.joindemo.service.APCourseService;
import com.genspark.joindemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apcourse/api")
public class APCourseController {
    @Autowired
    APCourseService apCourseService;
    @Autowired
    StudentService studentService;
    @GetMapping("/{studentId}/aPCourse")
    public List<APCourse> getAllAPCoursesByStudentId(@PathVariable(value = "studentId") Long studentId) {
//        if (!tutorialRepository.existsById(studentId)) {
//            throw new ResourceNotFoundException("Not found Tutorial with id = " + studentId);
//        }

        List<APCourse> apCourses = apCourseService.findAllAPCourseByStudentId(studentId);
        return apCourses;
    }
//    @GetMapping("/{aPCourseId}/students")
//    public List<Student> getAllStudentsByAPCourseId(@PathVariable(value = "aPCourseId") Long aPCourseId) {
//        List<Student> students = studentService.findAllStudentsByAPCourseId(aPCourseId);
//        return students;
//    }


}
