package com.genspark.joindemo.service;

import com.genspark.joindemo.entity.Student;
import com.genspark.joindemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student createStudent(Student student){
        return studentRepository.save(student);
    }
    public List<Student> viewAllStudents(){
        List<Student> students=studentRepository.findAll();
        return students;
    }

    public List<Student> getByCity(String city) {
        return studentRepository.getByAddressCity(city);
    }
}
