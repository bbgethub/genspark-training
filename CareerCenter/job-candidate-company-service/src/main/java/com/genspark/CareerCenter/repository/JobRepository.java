package com.genspark.CareerCenter.repository;

import com.genspark.CareerCenter.controller.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

}
