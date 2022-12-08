package com.genspark.SpringBootEmpDemo.Controller;


import com.genspark.SpringBootEmpDemo.Entity.Employee;
import com.genspark.SpringBootEmpDemo.Service.EmployeeService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class EmployeeControllerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Mock
    private EmployeeService mockEmployeeService;

    @InjectMocks
    EmployeeController mockEmployeeController;
    
    @Test
    public void getEmployeesTest1()
    {
        //Employee List created to hold test employee object
        List<Employee> testEmployees = new ArrayList<>();
        testEmployees.add(new Employee("name1","name1@email.com"));
        testEmployees.add(new Employee("name2","name2@email.com"));
        // Instruct mockito to return test employee list when the code flow encounters service call to getall employee
        // This has to be done prior to actual method call
        Mockito.when(mockEmployeeService.getAllEmployee()).thenReturn(testEmployees);
        // Actual method call
        List<Employee> employees= mockEmployeeController.getEmployees();
        // assert the  employees retrieved from the actual call is not null
        Assertions.assertNotNull(employees);
        // assert the  employees size retrieved from the actual call is what we expected.
        Assertions.assertEquals(testEmployees.size(),employees.size());
    }

    @Test
    public void getEmployeesTest2()
    {
        List<Employee> testEmployees = new ArrayList<>();
        // Instruct mockito to return test employee list when the code flow encounters service call to getall employee
        // This has to be done prior to actual method call
        Mockito.when(mockEmployeeService.getAllEmployee()).thenReturn(testEmployees);
        // Actual method call
        List<Employee> employees= mockEmployeeController.getEmployees();
        // assert the  employees retrieved from the actual call is  null
        Assertions.assertTrue(employees.isEmpty());
        // assert the  employees size retrieved from the actual call is what we expected.
        Assertions.assertEquals(0,employees.size());
    }

    @Test
    public void getEmployeeByIdTestWithcorrectnumberformat()
    {
        Employee testEmployee=new Employee("name1","name1@email.com");
        Mockito.when(mockEmployeeService.getEmployeeById(ArgumentMatchers.anyInt())).thenReturn(testEmployee);
        Employee employee= mockEmployeeController.getEmployeeDetails("1111");
        Assertions.assertNotNull(employee);
        Assertions.assertEquals(testEmployee.getEmployeeName(),employee.getEmployeeName());
    }

    @Test
    public void getEmployeeByIdTestWithincorrectnumberformat()
    {
        Employee testEmployee=new Employee("name1","name1@email.com");

//        Employee employee=mockMyController.getEmployeeDetails("#");
        Exception thrown = Assertions.assertThrows(NumberFormatException.class,() -> {
            mockEmployeeController.getEmployeeDetails("#");
        });
        Assertions.assertTrue(thrown.getMessage().contains("#"));
    }

}