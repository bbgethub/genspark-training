package com.genspark.CareerCenter.controller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "company_tbl1")
public class Company {
        
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        @Column(name="company_id")
            private Long id;
        
        @Getter
        @Setter
        @Column(name="company_name")
        private String companyName;
        
        @Getter
        @Setter
        @Column(name="company_address")
        private String companyAddress;

}
