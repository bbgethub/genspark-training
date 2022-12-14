package com.genspark.CareerCenter.service;

import com.genspark.CareerCenter.controller.entity.Job;
import com.genspark.CareerCenter.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
	public class JobService {

	        @Autowired
			JobRepository jobRepository;
	        
	     // CREATE 
	        public Job createJob(Job job) {
	            return jobRepository.save(job);
	        }

	        // READ
	        public List<Job> getJobs() {
	            return jobRepository.findAll();
	        }

			public Job getJob(Long jobId){
				Job job=jobRepository.findById(jobId).get();
				return job;
			}

	        // DELETE
	        public void deleteJob(Long empId) {
	            jobRepository.deleteById(empId);
	        }
	        
	     // UPDATE
	        public Job updateJob(Long jobId,Job jobDetails) {
				Job job = jobRepository.findById(jobId).get();
	                job.setJobTittle(jobDetails.getJobTittle());
	                job.setJobDescription(jobDetails.getJobDescription());
	                
	                return jobRepository.save(job);
	        }
	}

