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
@Table(name = "user_tbl")
public class User {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="user_id")
            private Long id;
        
        @Getter
        @Setter
        @Column(name="password")
        private String password;
}
