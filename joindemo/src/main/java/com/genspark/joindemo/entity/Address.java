package com.genspark.joindemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="address")
public class Address {
    @Getter
    @Setter
    @Column(name="id")
    @Id
    int id;
    @Getter
    @Setter
    @Column(name="street")
    String street;
    @Getter
    @Setter
    @Column(name="city")
    String city;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "address")
    private Student student;
}
