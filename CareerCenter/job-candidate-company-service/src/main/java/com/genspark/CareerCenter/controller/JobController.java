package com.genspark.CareerCenter.controller;

import com.genspark.CareerCenter.controller.entity.Job;
import com.genspark.CareerCenter.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class JobController {
        @Autowired
        JobService jobService;
        
        
        @RequestMapping(value="/jobs", method=RequestMethod.POST)
        public Job createCompany(@RequestBody Job job) {
            return jobService.createJob(job);
        }
        
        @RequestMapping(value="/jobs", method=RequestMethod.GET)
        public List<Job> readJob() {
            return jobService.getJobs();
        }

        @RequestMapping(value="/job/{jobId}", method=RequestMethod.PUT)
        public Job readJob(@PathVariable(value = "jobId") Long id, @RequestBody Job jobDetails) {
            return jobService.updateJob(id, jobDetails);
        }

        @RequestMapping(value="/job/{jobId}", method=RequestMethod.DELETE)
        public void deleteJob(@PathVariable(value = "jobId") Long id) {
            jobService.deleteJob(id);
        }

}