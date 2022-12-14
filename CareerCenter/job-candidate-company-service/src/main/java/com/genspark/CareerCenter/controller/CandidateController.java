package com.genspark.CareerCenter.controller;

import com.genspark.CareerCenter.entity.Candidate;
import com.genspark.CareerCenter.repository.CandidateRepository;
import com.genspark.CareerCenter.service.CandidateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
@Slf4j
@RestController
@RequestMapping("/career/api")
public class CandidateController {
        @Autowired
        CandidateService candidateService;
    @Autowired
    private CandidateRepository candidateRepository;


    @RequestMapping(value="/candidates", method=RequestMethod.POST)
        public Candidate createCandidate(@RequestPart("candidateName") String candidateName, @RequestPart("candidateCV") MultipartFile candidateCV)throws IOException {
            log.info("Inside createCandidate of CandidateController ");
            Candidate candidate=candidateService.createCandidate(candidateName,candidateCV);
            return candidate;
        }
        
        @RequestMapping(value="/candidates", method=RequestMethod.GET)
        public List<Candidate> readCandidates() throws Exception{
            log.info("Inside readCandidates of CandidateController ");
        //    Thread.sleep(5000);
       //     log.info("Inside readCandidates of CandidateController 2 ");
        return candidateService.getCandidates();
        }

        @RequestMapping(value="/candidate/{candidateId}", method=RequestMethod.GET)
        public Candidate readByCandidateId(@PathVariable(value= "candidateId") Long id){
            log.info("Inside readByCandidateId of CandidateController ");
            return candidateService.findCandidateById(id);
        }
        @RequestMapping(value="/candidate/{candidateId}", method=RequestMethod.PUT)
        public Candidate readCandidate(@PathVariable(value = "candidateId") Long id, @RequestPart("candidateName") String candidateName,@RequestPart("candidateCV") MultipartFile candidateCV)throws IOException {
            log.info("Inside readCandidate of CandidateController ");
            return candidateService.updateCandidate(id,candidateName,candidateCV);
        }

        @RequestMapping(value="/candidate/{candidateId}", method=RequestMethod.DELETE)
        public void deleteCandidates(@PathVariable(value = "candidateId") Long id) {
            log.info("Inside deleteCandidates of CandidateController ");
            candidateService.deleteCandidate(id);
        }

}