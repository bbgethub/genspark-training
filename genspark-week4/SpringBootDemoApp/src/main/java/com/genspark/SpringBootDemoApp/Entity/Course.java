package com.genspark.SpringBootDemoApp.Entity;

public class Course {
	
	private int courseId;
	private String title;
	private String instructor;
	public Course(int courseId, String title, String instructor) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.instructor = instructor;
	}
	public Course() {
		
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
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

}
