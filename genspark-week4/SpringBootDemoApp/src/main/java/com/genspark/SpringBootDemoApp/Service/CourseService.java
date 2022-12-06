package com.genspark.SpringBootDemoApp.Service;
import java.util.List;

import com.genspark.SpringBootDemoApp.Entity.Course;

public interface CourseService {

	Course getCourseId(int courseId);

	Course addCourse(Course course);

	Course updateCourse(Course course);

	String deleteCourseById(int courseId);

	List<Course> getAllCourses();

}
