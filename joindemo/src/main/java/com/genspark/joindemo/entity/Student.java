package com.genspark.joindemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
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
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    Address address;
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(
            name = "Students_Courses",
            joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id")
    )
    @Getter
    @Setter
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Set<APCourse> apCourseSet = new HashSet<>();
}
