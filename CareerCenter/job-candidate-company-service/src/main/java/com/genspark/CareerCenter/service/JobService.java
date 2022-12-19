package com.genspark.CareerCenter.service;

import com.genspark.CareerCenter.controller.entity.Job;
import com.genspark.CareerCenter.repository.JobRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
	public class JobService {

	        @Autowired
			JobRepository jobRepository;
	        
	     // CREATE 
	        public Job createJob(Job job) {
	            log.info("Inside createJob of JobService ");
				return jobRepository.save(job);
	        }

	        // READ
	        public List<Job> getJobs() {
				log.info("Inside getJobs of JobService ");
	            return jobRepository.findAll();
	        }

			public Job getJob(Long jobId){
				log.info("Inside getJob of JobService ");
				Job job=jobRepository.findById(jobId).get();
				return job;
			}

	        // DELETE
	        public void deleteJob(Long empId) {
				log.info("Inside deleteJob of JobService ");
				jobRepository.deleteById(empId);
	        }
	        
	     // UPDATE
	        public Job updateJobById(Long jobId,Job jobDetails) {
				log.info("Inside updateJobById of JobService ");
				Job job = jobRepository.findById(jobId).get();
	                job.setJobTittle(jobDetails.getJobTittle());
	                job.setJobDescription(jobDetails.getJobDescription());
	                
	                return jobRepository.save(job);
	        }
	}

