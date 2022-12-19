package com.genspark.CareerCenter.controller.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_tbl")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO, generator = "generator")
        @SequenceGenerator(name="generator", sequenceName="user_id", allocationSize = 1)
        @Column(name="id")
        @Getter
        private Long id;

        @Getter
        @Setter
        @Column(name="name")
        private String name;

        @Getter
        @Setter
        @Column(name="role_name")
        private String roleName;


        @Getter
        @Setter
        @Column(name="password")
        private String password;

}
