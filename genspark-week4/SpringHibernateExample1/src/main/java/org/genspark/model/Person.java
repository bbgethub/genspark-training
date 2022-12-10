package org.genspark.model;

import javax.persistence.*;

@Entity
@Table(name ="Person")
public class Person {
    @Id
    @Column(name ="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
    private String country;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
