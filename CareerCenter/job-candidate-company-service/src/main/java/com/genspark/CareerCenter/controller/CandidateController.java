package com.genspark.CareerCenter.controller;

import com.genspark.CareerCenter.controller.entity.Candidate;
import com.genspark.CareerCenter.service.CandidateService;
import com.genspark.CareerCenter.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class CandidateController {
        @Autowired
        CandidateService candidateService;
        
        
        @RequestMapping(value="/candidates", method=RequestMethod.POST)
        public Candidate createCandidate(@RequestBody Candidate candidate) {
            return candidateService.createCandidate(candidate);
        }
        
        @RequestMapping(value="/candidates", method=RequestMethod.GET)
        public List<Candidate> readCandidates() {
            return candidateService.getCompanies();
        }

        @RequestMapping(value="/candidate/{candidateId}", method=RequestMethod.PUT)
        public Candidate readCompanies(@PathVariable(value = "candidateId") Long id, @RequestBody Candidate candidateDetails) {
            return candidateService.updateCompany(id, candidateDetails);
        }

        @RequestMapping(value="/candidate/{candidateId}", method=RequestMethod.DELETE)
        public void deleteCandidates(@PathVariable(value = "candidateId") Long id) {
            candidateService.deleteCompany(id);
        }

}