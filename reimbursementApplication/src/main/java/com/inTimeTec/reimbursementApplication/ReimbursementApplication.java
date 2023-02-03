package com.inTimeTec.reimbursementApplication;

import com.inTimeTec.reimbursementApplication.Dao.*;
import com.inTimeTec.reimbursementApplication.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class ReimbursementApplication{

	public static void main(String[] args) {
		SpringApplication.run(ReimbursementApplication.class, args);
	}

//	@Autowired
//	private UserDao userRepository;
//
//	Random random = new Random();
//
//	public void createUsers() {
//
//		User user = new User();
//
//		long range = 1234567L;
//		Random r = new Random();
//		long id = (long)(r.nextDouble()*range);
//
//		//  Long id = new Long(random.nextInt(100)); //Long();
//		user.setId(id);
//		user.setEmail("user" + id + "@gmail.com");
//		user.setPassword("user" + id);
//		user.setEnabled(true);
//		user.setRol("Admin");
//		user.setUsername("user" + id);
//		User save = this.userRepository.save(user);
//
//		System.out.println(save);
//
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		createUsers();
//	}
//	@Autowired
//	private DepartmentDao departmentDao;
//
//	@Autowired
//	private ManagerDao managerDao;
//
//	@Autowired
//	private ProjectDao projectDao;
//
//    @Autowired
//	private ReimbursementDao reimbursementDao;
//
//	@Autowired
//	private EmployeeDao employeeDao;
//
//	@Override
//	public void run(String... args) throws Exception {
//
//
//		Department dept1=new Department("HR");
//		Department dept2=new Department("L&D");
//
//		Manager m1 = new Manager("Gopal");
//		Manager m2 = new Manager("Krishna");
//
//		Project p1 = new Project("Banking","Bangalore","12-05-2015");
//		Project p2 = new Project("FlightSearch","Noida","29-09-2017");
//
//
//
//
//
//		Employee emp1 = new Employee("Pradeep","Male","pradeep.pradeemb@gmail.com","pass1","02-02-2022","Punjab",dept1,m1,p1);
//		Employee emp2 = new Employee("Prashanth","Male","varugbhat@gmail.com","pass1","02-07-2021","Chennai",dept2,m2,p2);
//		Employee emp3 = new Employee("Monisha","Female","monisha.p@gmail.com","pass1","02-12-2020","Bangalore",dept2,m2,p2);
//
//		Reimbursement r1 = new Reimbursement(1200,"Internet Bill",true,"01-03-2022","31-03-2022","Applied",emp1);
//		Reimbursement r2 = new Reimbursement(2900,"Transportation Bill",true,"01-03-2022","31-03-2022","Applied",emp1);
//		Reimbursement r3 = new Reimbursement(1600,"Food Bill",true,"01-03-2022","31-03-2022","Applied",emp2);
//		Reimbursement r4 = new Reimbursement(6200,"Fuel Bill",true,"01-03-2022","31-03-2022","Applied",emp3);
//
//
//		this.departmentDao.save(dept1);
//		this.departmentDao.save(dept2);
//
//		this.managerDao.save(m1);
//		this.managerDao.save(m2);
//
//		this.projectDao.save(p1);
//		this.projectDao.save(p2);
//
//		this.employeeDao.save(emp1);
//		this.employeeDao.save(emp2);
//		this.employeeDao.save(emp3);
//
//		this.reimbursementDao.save(r1);
//		this.reimbursementDao.save(r2);
//		this.reimbursementDao.save(r3);
//		this.reimbursementDao.save(r4);
//
//		//this.reimbursementDao.updateReimById(5003);
//
//	}
}

