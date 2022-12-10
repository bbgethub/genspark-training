package com.genspark.CareerCenter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.genspark.CareerCenter.repository.CompanyRepository;

@Configuration
class LoadDatabase {	


  @Bean
  Object initDatabase(CompanyRepository repository) {
	  return new Object();
//	  repository.save(new Employee("Frodo Baggins", "thief",""),1l);
//
//    return args -> {
//      log.info("Preloading " + repository.save());
//      log.info("Preloading " + repository.save());
//    };
  }
}