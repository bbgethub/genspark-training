package com.genspark.SpringBootDemoApp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genspark.SpringBootDemoApp.DAO.CourseDao;
import com.genspark.SpringBootDemoApp.Entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getAllCourses(){
		return this.courseDao.findAll();
	}
	@Override
	public Course getCourseId(int courseId) {
		// TODO Auto-generated method stub
			Optional<Course> c=this.courseDao.findById(courseId);
			Course course=null;
			if(c.isPresent())
				
				course=c.get();
			else 
				throw new RuntimeException("Course not found or this id:"+courseId);
				
			return course;
	}
	@Override
	public Course addCourse(Course course) {
		return this.courseDao.save(course);
	}
	@Override
	public Course updateCourse(Course course) {
		return this.courseDao.save(course);
	}
	@Override
	public String deleteCourseById(int courseId) {
		this.courseDao.deleteById(courseId);
		return "Deleted Successfully";
	}
	
}
