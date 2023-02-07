package com.genspark.grades.repository;
import com.genspark.grades.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository extends JpaRepository<Grade,Integer> {

    List<Grade> findGradeByStudentId(Integer studentId);
}
