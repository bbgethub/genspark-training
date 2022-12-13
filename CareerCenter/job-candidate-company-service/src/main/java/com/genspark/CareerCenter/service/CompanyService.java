package com.genspark.CareerCenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genspark.CareerCenter.controller.entity.Company;
import com.genspark.CareerCenter.repository.CompanyRepository;

@Service
	public class CompanyService {

	        @Autowired
			CompanyRepository companyRepository;
	        
	     // CREATE 
	        public Company createCompany(Company company) {
	            return companyRepository.save(company);
	        }

	        // READ
	        public List<Company> getCompanies() {
	            return companyRepository.findAll();
	        }

	        // DELETE
	        public void deleteCompany(Long companyId) {
	            companyRepository.deleteById(companyId);
	        }
	        
	     // UPDATE
	        public Company updateCompany(Long companyId, Company companyDetails) {
	                Company company = companyRepository.findById(companyId).get();
	                company.setCompanyName(companyDetails.getCompanyName());
	                company.setCompanyAddress(companyDetails.getCompanyAddress());
	                
	                return companyRepository.save(company);
	        }
	}

