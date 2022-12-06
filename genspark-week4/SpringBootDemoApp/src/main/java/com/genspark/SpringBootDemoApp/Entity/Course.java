package com.genspark.SpringBootDemoApp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses_tbl")
public class Course {
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE)
	private int c_Id;
	private String title;
	private String instructor;
	public Course(String title, String instructor) {
		this.title = title;
		this.instructor = instructor;
	}
	public Course() {
		
	}
	public int getCourseId() {
		return c_Id;
	}
	public void setCourseId(int courseId) {
		this.c_Id = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public void get() {
		// TODO Auto-generated method stub
		
	}

}
