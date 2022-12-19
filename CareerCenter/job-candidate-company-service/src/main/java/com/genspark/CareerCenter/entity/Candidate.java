package com.genspark.CareerCenter.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "candidate_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
            private Long id;
        
        @Getter
        @Setter
        @Column(name="name")
        private String candidateName;
        
        @Getter
        @Setter
        @Column(name="cv")
        @Lob
        private byte[] candidateCV;

}
