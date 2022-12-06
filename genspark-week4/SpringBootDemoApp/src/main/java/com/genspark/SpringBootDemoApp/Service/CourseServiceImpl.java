package com.genspark.SpringBootDemoApp.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.genspark.SpringBootDemoApp.Entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl()
	{
		list=new ArrayList();
		list.add(new Course(101,"Java","John"));
		list.add(new Course(102,"HTML","Alex"));
		list.add(new Course(103,"PLSql","Sam"));
	}
	public List<Course> getAllCourses(){
		return list;
	}
	@Override
	public Course getCourseId(int courseId) {
		// TODO Auto-generated method stub
		Course c=null;
		for(Course course:list)
		{
			if(course.getCourseId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		String title=course.getTitle();
		String instructor=course.getInstructor();
		Course c=null;
		for(Course cu:list)
		{
			if(cu.getCourseId()==course.getCourseId())
			{
				cu.setTitle(title);
				cu.setInstructor(instructor);
				c=cu;
				break;
			}
		}
		return c;
	}
	@Override
	public String deleteCourseById(int courseId) {
		// TODO Auto-generated method stub
		for(Course course:list)
		{
			if(course.getCourseId()==courseId)
			{
				list.remove(course);
				break;
			}
		}
		return "Deleted Successfully";
	}
	
}
