package com.genspark.CareerCenter.service;

import com.genspark.CareerCenter.controller.entity.Candidate;
import com.genspark.CareerCenter.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
	public class CandidateService {

	        @Autowired
			CandidateRepository candidateRepository;
	        
	     // CREATE 
	        public Candidate createCandidate(Candidate candidate) {
	            return candidateRepository.save(candidate);
	        }

	        // READ
	        public List<Candidate> getCompanies() {
	            return candidateRepository.findAll();
	        }

	        // DELETE
	        public void deleteCompany(Long candidateId) {
	            candidateRepository.deleteById(candidateId);
	        }
	        
	     // UPDATE
	        public Candidate updateCompany(Long candidateId, Candidate candidateDetails) {
				Candidate candidate = candidateRepository.findById(candidateId).get();
				candidate.setCandidateName(candidateDetails.getCandidateName());
				candidate.setCandidateCV(candidateDetails.getCandidateCV());
	                
	                return candidateRepository.save(candidate);
	        }
	}

