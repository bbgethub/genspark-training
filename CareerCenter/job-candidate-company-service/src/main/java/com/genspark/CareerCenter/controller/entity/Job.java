package com.genspark.CareerCenter.controller.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "job_tbl")
public class Job {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="job_id")
            private Long id;
        
        @Getter
        @Setter
        @Column(name="job_tittle")
        private String jobTittle;
        
        @Getter
        @Setter
        @Column(name="job_description")
        private String jobDescription;

}
