package com.genspark.joindemo.service;

import com.genspark.joindemo.entity.APCourse;
import com.genspark.joindemo.entity.Student;
import com.genspark.joindemo.repository.APCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class APCourseService {
    @Autowired
    APCourseRepository apCourseRepository;
    public List<APCourse> findAllAPCourseByStudentId(Long studentId){
        List<APCourse> apCourses=apCourseRepository.findAPCourseByStudentId(studentId);
        return apCourses;
    }

}
