package com.genspark.SpringBootDemoApp.Service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;

import java.util.Optional;

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

import com.genspark.SpringBootDemoApp.DAO.CourseDao;
import com.genspark.SpringBootDemoApp.Entity.Course;

@ExtendWith(MockitoExtension.class)
class CourseServiceImplTest {

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

	@InjectMocks
	CourseServiceImpl courseService;
	
	@Mock
	CourseDao courseDao;
	
	@Test
	void testGetCourseId() {
		Course mockCourse = new Course("mockTitle","self");
		Optional<Course> optionalMockCourse = Optional.of(mockCourse);
		Mockito.doReturn(optionalMockCourse).when(courseDao).findById(anyInt());
		Course course = courseService.getCourseId(8989);
		assertNotNull(course);		
	}
	
	@Test
	void testGetCourseIdNotPresent() {
		
		Exception thrown = assertThrows(RuntimeException.class, () -> {
			Optional<Course> optionalMockCourse = Optional.empty();
			Mockito.doReturn(optionalMockCourse).when(courseDao).findById(anyInt());
			courseService.getCourseId(8989);		
	  });
		
		assertTrue(thrown.getMessage().contains("Course not found or this id"));

	}

}
