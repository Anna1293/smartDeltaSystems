package com.smartdeltasystems.mapper.mapperimpl;

import com.smartdeltasystems.dataaccess.document.Student;
import com.smartdeltasystems.dataaccess.dto.StudentDto;
import com.smartdeltasystems.mapper.mapperapi.StudentMapper;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentMapperImpl implements StudentMapper {

    public List<StudentDto> studentDocumentToDto(List<Student> students) {
        return Optional.ofNullable(students)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(StudentDto::new)
                .collect(Collectors.toList());
    }

    public Student dtoToStudentDocument(StudentDto studentDto, Student student) {
        Optional.ofNullable(studentDto.getName()).ifPresent(student::setName);
        Optional.ofNullable(studentDto.getLastName()).ifPresent(student::setLastName);
        Optional.ofNullable(studentDto.getPatronymic()).ifPresent(student::setPatronymic);
        Optional.ofNullable(studentDto.getGroup()).ifPresent(student::setGroup);
        Optional.ofNullable(studentDto.getAverageRating()).ifPresent(student::setAverageRating);
        return student;
    }
}
