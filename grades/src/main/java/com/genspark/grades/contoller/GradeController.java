package com.genspark.grades.contoller;

import com.genspark.grades.entity.Grade;
import com.genspark.grades.service.GradeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/grade/api")
@Slf4j
public class GradeController {
    @Autowired
    GradeService gradeService;
    @PostMapping("/create")
    public Grade createGrade(@RequestBody Grade grade){
        log.info("Inside createGrade method of GradeController");
        return gradeService.createGrade(grade);
    }
    @GetMapping("/all")
    public List<Grade> viewAllGrades(){
        log.info("Inside viewAllGrades method of GradeController");
        return gradeService.viewAllGrades();
    }
    @GetMapping("/{id}")
    public Optional<Grade> getGardeById(@PathVariable("id") Integer gradeId){
        return gradeService.FindByGardeId(gradeId);
    }
    @GetMapping("/grades/{id}")
    public List<Grade> getGardesByStudentId(@PathVariable("id") Integer gradeId){
        return gradeService.FindGardeByStudentId(gradeId);
    }

}
