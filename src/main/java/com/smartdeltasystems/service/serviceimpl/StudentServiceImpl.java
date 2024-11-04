package com.smartdeltasystems.service.serviceimpl;

import com.smartdeltasystems.dataaccess.document.Student;
import com.smartdeltasystems.dataaccess.dto.StudentDto;
import com.smartdeltasystems.dataaccess.repository.StudentRepository;
import com.smartdeltasystems.mapper.mapperapi.StudentMapper;
import com.smartdeltasystems.service.serviceapi.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public List<StudentDto> getAll() {
        List<Student> students = studentRepository.findAll();
        return studentMapper.studentDocumentToDto(students);
    }

    @Override
    public void updateStudent(StudentDto studentDto, String studentId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalArgumentException("Студент не найден по идентификатору: " + studentId));
        studentMapper.dtoToStudentDocument(studentDto, student);
        studentRepository.save(student);
    }

    @Override
    public String createStudent(StudentDto studentDto) {
        Student student = studentMapper.dtoToStudentDocument(studentDto, new Student());
        return studentRepository.save(student).getId();
    }

    @Override
    public void deleteStudent(String studentId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalArgumentException("Студент не найден по идентификатору: " + studentId));
        studentRepository.delete(student);
    }
}
