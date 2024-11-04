package com.smartdeltasystems.dataaccess.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "students")
public class Student {
    @Id
    private String id;
    private String lastName;
    private String name;
    private String patronymic;
    private String group;
    private Double averageRating;
}
