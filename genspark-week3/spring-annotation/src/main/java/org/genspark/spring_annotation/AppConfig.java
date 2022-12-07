package org.genspark.spring_annotation;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


	@Bean
	public List<Phone> phoneBeans()
	{
		
		Phone phone1 = new Phone();
		phone1.setMob("111111");
		Phone phone2 = new Phone();
		phone2.setMob("222222");
		Phone phone3 = new Phone();
		phone3.setMob("333333");
		return Arrays.asList(phone1,phone2,phone3);
	}
	
	@Bean
	public Address addressBean()
	{
		Address address=new Address();
		address.setCity("Powel");
		address.setCountry("USA");
		address.setState("Ohio");
		address.setZipcode("11223");
		return address;
	}

	


	@Bean
	public Employee employeeBean()
	{
		//System.out.println("Inside employeeBean");
		Employee employee=new Employee();
		employee.setId(1010);
		employee.setName("Adam");
		employee.setAdd(addressBean());
		employee.setPh(phoneBeans());
		return employee;
	}
	
	
}
