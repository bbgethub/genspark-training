package com.genspark.joindemo.VO;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grade {
    int id;
    int studentId;
    int courseId;
    String gradeLevel;
}
