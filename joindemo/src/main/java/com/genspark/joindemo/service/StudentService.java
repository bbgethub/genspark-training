package com.genspark.joindemo.service;

import com.genspark.joindemo.VO.Grade;
import com.genspark.joindemo.VO.ResponseTemplateVO;
import com.genspark.joindemo.entity.Student;
import com.genspark.joindemo.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private RestTemplate restTemplate;
    public Student createStudent(Student student){
        log.info("Inside createStudent method of StudentService");
        return studentRepository.save(student);
    }
    public List<Student> viewAllStudents(){
        log.info("Inside viewAllStudents method of StudentService");
        List<Student> students=studentRepository.findAll();
        return students;
    }

    public List<Student> getByCity(String city) {
        return studentRepository.getByAddressCity(city);
    }

    public ResponseTemplateVO getStudentWithGrades(Integer studentId) {
        log.info("Inside getStudentWithGrades method of StudentService");
        ResponseTemplateVO responseTemplateVO= new ResponseTemplateVO();
        Optional<Student> student=studentRepository.findById(studentId);
        Grade[] grade= restTemplate.getForObject("http://localhost:9002/grade/api/grades/" + studentId, Grade[].class);
            responseTemplateVO.setStudent(student);
            responseTemplateVO.setGrade(List.of(grade));
        return responseTemplateVO;
    }

//    public List<Student> findAllStudentsByAPCourseId(Long aPCourseId) {
//        return studentRepository.findStudentByAPCourseId(aPCourseId);
//    }
//    public List<Student> getByCourse(String course){
//        return studentRepository.getByCourse(course);
//    }
}
