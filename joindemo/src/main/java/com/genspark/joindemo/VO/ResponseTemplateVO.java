package com.genspark.joindemo.VO;

import com.genspark.joindemo.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Optional<Student> student;
    private List<Grade> grade;
}
