package com.genspark.CareerCenter.service;
import com.genspark.CareerCenter.entity.Candidate;
import com.genspark.CareerCenter.repository.CandidateRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
@Slf4j
@Service
	public class CandidateService {

	        @Autowired
			CandidateRepository candidateRepository;
	        
	     // CREATE 
	        public Candidate createCandidate(String candidateName, MultipartFile candidateCV) throws IOException {
				log.info("Inside createCandidate of CandidateService");
				byte[] bytes = candidateCV.getBytes();
				Candidate candidate=new Candidate();
				candidate.setCandidateCV(bytes);
				candidate.setCandidateName(candidateName);
				System.out.println(candidateName);
	            return candidateRepository.save(candidate);
	        }

	        // READ
	        public List<Candidate> getCandidates() {
				log.info("Inside getCandidates of CandidateService");
				return candidateRepository.findAll();
	        }

	        // DELETE
	        public void deleteCandidate(Long candidateId) {
				log.info("Inside deleteCandidate of CandidateService");
				candidateRepository.deleteById(candidateId);
	        }
	        
	     // UPDATE
	        public Candidate updateCandidate(Long candidateId,String candidateName, MultipartFile candidateCV) throws IOException{
				log.info("Inside updateCandidate of CandidateService");
				Candidate candidate = candidateRepository.findById(candidateId).get();
				candidate.setCandidateName(candidateName);
				candidate.setCandidateCV(candidateCV.getBytes());
	                return candidateRepository.save(candidate);
	        }

	public Candidate findCandidateById(Long id) {
		log.info("Inside findCandidateById of CandidateService");
		Candidate candidate = candidateRepository.findById(id).get();
		return candidate;
	}
}

