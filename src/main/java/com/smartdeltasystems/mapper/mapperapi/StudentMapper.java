package com.smartdeltasystems.mapper.mapperapi;

import com.smartdeltasystems.dataaccess.document.Student;
import com.smartdeltasystems.dataaccess.dto.StudentDto;

import java.util.List;

public interface StudentMapper {

    List<StudentDto> studentDocumentToDto(List<Student> students);

    Student dtoToStudentDocument(StudentDto studentDto, Student student);
}
