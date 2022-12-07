package com.genspark.SpringBootDemoApp.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.genspark.SpringBootDemoApp.Entity.Course;

@Repository
public interface CourseDao extends JpaRepository<Course,Integer>{

}
