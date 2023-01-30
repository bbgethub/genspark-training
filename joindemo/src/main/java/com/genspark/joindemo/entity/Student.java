package com.genspark.joindemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Getter
    int id;
    @Getter
    @Setter
    @Column(name="first_name")
    String firstName;
    @Getter
    @Setter
    @Column(name="last_name")
    String lastName;
    @Getter
    @Setter
    @Column(name="email")
    String email;
    @Getter
    @Setter
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="address_id")
    Address address;
}
