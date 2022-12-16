package com.genspark.CareerCenter.controller;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.genspark.CareerCenter.controller.entity.Company;
import com.genspark.CareerCenter.service.CompanyService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@Slf4j
@RequestMapping("/career/api")
public class CompanyController {
        @Autowired
        CompanyService companyService;
        
        
        @RequestMapping(value="/companies", method=RequestMethod.POST)
        public Company createCompany(@RequestBody Company company) {
            log.info("Inside createCompany of CompanyController");
            return companyService.createCompany(company);
        }
        
        @RequestMapping(value="/companies", method=RequestMethod.GET)
        public List<Company> readCompanies() {
            log.info("Inside readCompanies of CompanyController");
            return companyService.getCompanies();
        }
         @RequestMapping(value="/company/{companyId}", method=RequestMethod.GET)
         public Company readCompany(@PathVariable(value="CompanyId")Long id) {
             log.info("Inside readCompany of CompanyController");
        return companyService.getCompany(id);
    }

        @RequestMapping(value="/company/{companyId}", method=RequestMethod.PUT)
        public Company readCompanies(@PathVariable(value = "companyId") Long id, @RequestBody Company companyDetails) {
            log.info("Inside readCompanies of CompanyController");
            return companyService.updateCompany(id, companyDetails);
        }

        @RequestMapping(value="/company/{companyId}", method=RequestMethod.DELETE)
        public void deleteCompanies(@PathVariable(value = "companyId") Long id) {
            log.info("Inside deleteCompanies of CompanyController");
            companyService.deleteCompany(id);
        }

}