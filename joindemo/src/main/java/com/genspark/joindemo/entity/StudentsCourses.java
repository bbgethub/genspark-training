package com.genspark.joindemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class StudentsCourses implements Serializable {
    @Column(name="student_id")
    int studentId;
    @Column(name="course_id")
    int courseId;
}
