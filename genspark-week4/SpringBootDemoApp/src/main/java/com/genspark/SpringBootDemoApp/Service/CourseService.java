package com.genspark.SpringBootDemoApp.Service;
import java.util.List;

import com.genspark.SpringBootDemoApp.Entity.Course;

public interface CourseService {
	
	List<Course> getAllCourses();
	Course getCourseId(int courseID);
	Course addCourse(Course course);
	Course updateCourse(Course course);
	String deleteCourseById(int courseId);

}
