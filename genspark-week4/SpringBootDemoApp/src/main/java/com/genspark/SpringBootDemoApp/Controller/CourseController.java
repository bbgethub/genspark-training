package com.genspark.SpringBootDemoApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.genspark.SpringBootDemoApp.Entity.Course;
import com.genspark.SpringBootDemoApp.Service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService; 
	@RequestMapping("/")
	public String home()
	{
		return "<HTML><H1>Welcome to Genspark courses</H1></HTML>";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return courseService.getAllCourses();
		
	}
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) 
	{
		return this.courseService.getCourseId(Integer.parseInt(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
		
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.courseService.updateCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public String deleteCourse(@PathVariable String courseId)
	{
		return this.courseService.deleteCourseById(Integer.parseInt(courseId));
	}
}
