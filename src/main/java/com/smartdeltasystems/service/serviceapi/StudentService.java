package com.smartdeltasystems.service.serviceapi;

import com.smartdeltasystems.dataaccess.dto.StudentDto;

import java.util.List;


public interface StudentService {

    List<StudentDto> getAll();

    void updateStudent(StudentDto studentDto, String studentId);

    String createStudent(StudentDto studentDto);

    void deleteStudent(String studentId);
}

