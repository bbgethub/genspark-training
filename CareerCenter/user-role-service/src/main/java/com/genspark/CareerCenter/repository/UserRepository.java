package com.genspark.CareerCenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.genspark.CareerCenter.controller.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
