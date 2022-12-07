package com.genspark.SpringBootDemoApp.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.anyInt;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.genspark.SpringBootDemoApp.Entity.Course;
import com.genspark.SpringBootDemoApp.Service.CourseService;

@ExtendWith(MockitoExtension.class)
class CourseControllerTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Mock
	CourseService courseService;
	
	@InjectMocks
	CourseController courseController;
	
	@Test
	void testGetCourses() {
		
		List<Course> mockCourses = new ArrayList();
		mockCourses.add(new Course("mockTitle","self"));
		
		// When someone calls getcourses on mocked controller then return the mockcourses
		Mockito.doReturn(mockCourses).when(courseService).getAllCourses();		
		List<Course> courses = courseController.getCourses();
		
		assertNotNull(courses);
		assertEquals(courses.size(),mockCourses.size());

	}
	
	@Test
	void testGetCourse() {
		
		
		Course mockCourse = new Course("mockTitle","self");
		
		// When someone calls getcourses on mocked controller then return the mockcourses
	
		Mockito.doReturn(mockCourse).when(courseService).getCourseId(anyInt());		
		Course course = courseController.getCourse("999");
		
		assertNotNull(course);
		assertEquals(course.getInstructor(),"self");

	}
	
	@Test
	void testAddCourse() {		
		
		Course mockCourse = new Course("mockTitle","self");		

		Mockito.doReturn(mockCourse).when(courseService).addCourse(Mockito.any(Course.class));		
		Course course = courseController.addCourse(mockCourse);
		
		assertNotNull(course);
		assertEquals(course.getInstructor(),"self");

	}
	


}
