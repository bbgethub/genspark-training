package com.genspark.joindemo.DTO;

import com.genspark.joindemo.entity.Student;
import lombok.*;

@AllArgsConstructor
@ToString
@NoArgsConstructor
public class StudentResponse {
    @Getter
    @Setter
    int id;
    @Getter
    @Setter
    String firstName;
    @Getter
    @Setter
    String lastName;
    @Getter
    @Setter
    String email;
    @Getter
    @Setter
    String street;
    @Getter
    @Setter
    String city;

    public StudentResponse(Student student) {
        this.id=student.getId();
        this.firstName=student.getFirstName();
        this.lastName=student.getLastName();
        this.email=student.getEmail();
        this.street=student.getAddress().getStreet();
        this.city=student.getAddress().getCity();
    }
}
