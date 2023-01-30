package com.genspark.joindemo.repository;

import com.genspark.joindemo.entity.Address;
import com.genspark.joindemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
   // List<Student> findByAddressCity(String city);
    @Query("from Student where address.city=:city")
    List<Student> getByAddressCity(String city);
}
