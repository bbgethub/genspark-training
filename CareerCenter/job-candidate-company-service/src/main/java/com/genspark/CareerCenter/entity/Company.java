package com.genspark.CareerCenter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "company_tbl")
public class Company {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
            private Long id;
        
        @Getter
        @Setter
        @Column(name="name")
        private String companyName;
        
        @Getter
        @Setter
        @Column(name="address")
        private String companyAddress;

}
