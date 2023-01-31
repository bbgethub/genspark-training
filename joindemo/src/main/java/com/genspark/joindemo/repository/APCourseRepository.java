package com.genspark.joindemo.repository;

import com.genspark.joindemo.entity.APCourse;
import com.genspark.joindemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface APCourseRepository extends JpaRepository<APCourse,Long> {
    List<APCourse> findAPCourseByStudentId(Long studentId);
}
