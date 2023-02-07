package com.genspark.joindemo.service;

import com.genspark.joindemo.entity.APCourse;
import com.genspark.joindemo.entity.Student;
import com.genspark.joindemo.repository.APCourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class APCourseService {
    @Autowired
    private APCourseRepository apCourseRepository;
    public List<APCourse> findAllAPCourseByStudentId(Long studentId){
        log.info("Inside findAllAPCourseByStudentId method of APCourseService");
        List<APCourse> apCourses=apCourseRepository.findAPCourseByStudentId(studentId);
        return apCourses;
    }

}
