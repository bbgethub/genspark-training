package com.genspark.CareerCenter.service;
import com.genspark.CareerCenter.controller.entity.Candidate;
import com.genspark.CareerCenter.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
	public class CandidateService {

	        @Autowired
			CandidateRepository candidateRepository;
	        
	     // CREATE 
	        public Candidate createCandidate(String candidateName, MultipartFile candidateCV) throws IOException {
				byte[] bytes = candidateCV.getBytes();
				Candidate candidate=new Candidate();
				candidate.setCandidateCV(bytes);
				candidate.setCandidateName(candidateName);
				System.out.println(candidateName);
	            return candidateRepository.save(candidate);
	        }

	        // READ
	        public List<Candidate> getCandidates() {
	            return candidateRepository.findAll();
	        }

	        // DELETE
	        public void deleteCandidate(Long candidateId) {
	            candidateRepository.deleteById(candidateId);
	        }
	        
	     // UPDATE
	        public Candidate updateCandidate(Long candidateId, Candidate candidateDetails) {
				Candidate candidate = candidateRepository.findById(candidateId).get();
				candidate.setCandidateName(candidateDetails.getCandidateName());
				candidate.setCandidateCV(candidateDetails.getCandidateCV());
	                
	                return candidateRepository.save(candidate);
	        }

	public Candidate findCandidateById(Long id) {
		Candidate candidate = candidateRepository.findById(id).get();
		return candidate;
	}
}
