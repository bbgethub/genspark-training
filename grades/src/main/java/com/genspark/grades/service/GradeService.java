package com.genspark.grades.service;

import com.genspark.grades.entity.Grade;
import com.genspark.grades.repository.GradeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class GradeService {
    @Autowired
    GradeRepository gradeRepository;
    public Grade createGrade(Grade grade){
        log.info("Inside createGrade method of GradeService");
        return gradeRepository.save(grade);
    }
    public List<Grade> viewAllGrades(){
        log.info("Inside viewAllGrades method of GradeService");
        return gradeRepository.findAll();
    }


    public Optional<Grade> FindByGardeId(Integer gradeId) {
        return gradeRepository.findById(gradeId);
    }

    public List<Grade> FindGardeByStudentId(Integer StudentId) {
        return gradeRepository.findGradeByStudentId(StudentId);
    }
}
