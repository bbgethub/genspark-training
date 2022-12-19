package com.genspark.CareerCenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.genspark.CareerCenter.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
