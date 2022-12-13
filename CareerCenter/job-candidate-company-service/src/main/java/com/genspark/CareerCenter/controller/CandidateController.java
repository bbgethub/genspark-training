package com.genspark.CareerCenter.controller;

import com.genspark.CareerCenter.controller.entity.Candidate;
import com.genspark.CareerCenter.repository.CandidateRepository;
import com.genspark.CareerCenter.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CandidateController {
        @Autowired
        CandidateService candidateService;
    @Autowired
    private CandidateRepository candidateRepository;


    @RequestMapping(value="/candidates", method=RequestMethod.POST)
        public Candidate createCandidate(@RequestPart("candidateName") String candidateName, @RequestPart("candidateCV") MultipartFile candidateCV)throws IOException {
            Candidate candidate=candidateService.createCandidate(candidateName,candidateCV);
            return candidate;
        }
        
        @RequestMapping(value="/candidates", method=RequestMethod.GET)
        public List<Candidate> readCandidates() {
            return candidateService.getCandidates();
        }

        @RequestMapping(value="/candidate/{candidateId}", method=RequestMethod.GET)
        public Candidate readByCandidateId(@RequestParam(value= "candidateId", defaultValue="1") Long id){
            return candidateService.findCandidateById(id);
        }
        @RequestMapping(value="/candidate/{candidateId}", method=RequestMethod.PUT)
        public Candidate readCandidate(@PathVariable(value = "candidateId") Long id, @RequestBody Candidate candidateDetails) {
            return candidateService.updateCandidate(id, candidateDetails);
        }

        @RequestMapping(value="/candidate/{candidateId}", method=RequestMethod.DELETE)
        public void deleteCandidates(@PathVariable(value = "candidateId") Long id) {
            candidateService.deleteCandidate(id);
        }

}