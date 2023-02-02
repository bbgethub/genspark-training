package com.genspark.joindemo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.genspark.joindemo.entity.APCourse;
import com.genspark.joindemo.entity.Address;
import com.genspark.joindemo.entity.Student;
import com.genspark.joindemo.service.StudentService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(MockitoJUnitRunner.class)
class StudentControllerTest {
    private MockMvc mockMvc;
    ObjectMapper objectMapper=new ObjectMapper();
    ObjectWriter objectWriter=objectMapper.writer();
    @Mock
    private StudentService studentService;
    @InjectMocks
    private StudentController studentController;
    Address address1=new Address(1,"Street1","city1");
    APCourse apCourse1=new APCourse(1,"course1");
    APCourse apCourse2=new APCourse(2,"course2");
    Set<APCourse> apCourseSet=new HashSet<APCourse>();
//    apCourseSet.add(apCourse1);
//    apCourseSet.add(apCourse2);
    Student record1=new Student(1,"FirstName1","LastName","email1@gmail.com",address1,apCourseSet);

    @BeforeEach
    void setUp() {
        this.mockMvc= MockMvcBuilders.standaloneSetup(studentController).build();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createStudent() throws Exception{
        Student studentTest=record1;
        Mockito.when(studentService.createStudent(studentTest)).thenReturn(studentTest);
        mockMvc.perform(MockMvcRequestBuilders
                .post("/create")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("fname",is("FirstName1")));
    }

    @Test
    void viewAllStudent() {
    }

    @Test
    void getByCity() {
    }
}