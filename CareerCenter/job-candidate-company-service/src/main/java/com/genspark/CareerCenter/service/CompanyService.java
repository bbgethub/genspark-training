package com.genspark.CareerCenter.service;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genspark.CareerCenter.controller.entity.Company;
import com.genspark.CareerCenter.repository.CompanyRepository;
@Slf4j
@Service
	public class CompanyService {

	        @Autowired
			CompanyRepository companyRepository;
	        
	     // CREATE 
	        public Company createCompany(Company company) {
				log.info("Inside createCompany of CompanyService");
				return companyRepository.save(company);
	        }

	        // READ
	        public List<Company> getCompanies() {
				log.info("Inside getCompanies of CompanyService");
	            return companyRepository.findAll();
	        }
			public Company getCompany(Long companyId)
			{
				log.info("Inside getCompany of CompanyService");
				Company company=companyRepository.findById(companyId).get();
				return company;
			}
	        // DELETE
	        public void deleteCompany(Long companyId) {
				log.info("Inside deleteCompany of CompanyService");
				companyRepository.deleteById(companyId);
	        }
	        
	     // UPDATE
	        public Company updateCompany(Long companyId, Company companyDetails) {
					log.info("Inside updateCompany of CompanyService");
	                Company company = companyRepository.findById(companyId).get();
	                company.setCompanyName(companyDetails.getCompanyName());
	                company.setCompanyAddress(companyDetails.getCompanyAddress());
	                
	                return companyRepository.save(company);
	        }
	}

