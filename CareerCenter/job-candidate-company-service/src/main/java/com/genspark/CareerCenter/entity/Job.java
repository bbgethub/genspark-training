package com.genspark.CareerCenter.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "job_tbl")
public class Job {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
            private Long id;
        
        @Getter
        @Setter
        @Column(name="tittle")
        private String jobTittle;
        
        @Getter
        @Setter
        @Column(name="description")
        private String jobDescription;

}
