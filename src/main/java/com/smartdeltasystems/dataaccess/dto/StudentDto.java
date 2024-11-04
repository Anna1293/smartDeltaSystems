package com.smartdeltasystems.dataaccess.dto;

import com.smartdeltasystems.dataaccess.document.Student;
import lombok.Data;

@Data
public class StudentDto {

    private String id;
    private String lastName;
    private String name;
    private String patronymic;
    private String group;
    private Double averageRating;

    public StudentDto(Student student) {
        this.id = student.getId();
        this.lastName = student.getLastName();
        this.name = student.getName();
        this.patronymic = student.getPatronymic();
        this.group = student.getGroup();
        this.averageRating = student.getAverageRating();
    }

    public StudentDto() {
    }
}
