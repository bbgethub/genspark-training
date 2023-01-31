package com.genspark.joindemo.repository;

import com.genspark.joindemo.entity.APCourse;
import com.genspark.joindemo.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
   // List<Student> findByAddressCity(String city);
    @Query("from Student where address.city=:city")
    List<Student> getByAddressCity(String city);
  //  @Query("select s from Student s join s.apCourseSet c where c.name like LIKE %?1%")
 //   @Query("select s.id,s.firstName,s.lastName, s.email from student s left join students_courses sc on s.id=sc.student_id where sc.course_id=:aPCourseId")
//    List<Student> findStudentByAPCourseId(Long aPCourseId);

}
