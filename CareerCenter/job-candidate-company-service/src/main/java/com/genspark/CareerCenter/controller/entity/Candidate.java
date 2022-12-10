package com.genspark.CareerCenter.controller.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "candidate_tbl")
public class Candidate {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="candidate_id")
            private Long id;
        
        @Getter
        @Setter
        @Column(name="candidate_name")
        private String candidateName;
        
        @Getter
        @Setter
        @Column(name="candidate_cv")
        private String candidateCV;

}
