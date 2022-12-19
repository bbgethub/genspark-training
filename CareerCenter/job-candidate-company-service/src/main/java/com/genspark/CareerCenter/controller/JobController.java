package com.genspark.CareerCenter.controller;

import com.genspark.CareerCenter.controller.entity.Job;
import com.genspark.CareerCenter.service.JobService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@Slf4j
@RequestMapping("/career/api")
public class JobController {
        @Autowired
        JobService jobService;
        
        
        @RequestMapping(value="/jobs", method=RequestMethod.POST)
        public Job createJob(@RequestBody Job job) {
            log.info("Inside createJob of JobController");
            return jobService.createJob(job);
        }
        
        @RequestMapping(value="/jobs", method=RequestMethod.GET)
        public List<Job> readJobs() {
            log.info("Inside readJobs of JobController");
            return jobService.getJobs();
        }

        @RequestMapping(value="/job/{jobId}", method=RequestMethod.GET)
        public Job readJob(@PathVariable(value="jobId") Long id) {
            log.info("Inside readJob of JobController");
            return jobService.getJob(id);
    }

        @RequestMapping(value="/job/{jobId}", method=RequestMethod.PUT)
        public Job updateJob(@PathVariable(value = "jobId") Long id, @RequestBody Job jobDetails) {
            log.info("Inside updateJob of JobController");
            return jobService.updateJobById(id, jobDetails);
        }

        @RequestMapping(value="/job/{jobId}", method=RequestMethod.DELETE)
        public void deleteJob(@PathVariable(value = "jobId") Long id) {
            log.info("Inside deleteJob of JobController");
            jobService.deleteJob(id);
        }

}