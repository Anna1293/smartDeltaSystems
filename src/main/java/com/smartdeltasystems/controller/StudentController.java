package com.smartdeltasystems.controller;

import com.smartdeltasystems.common.Urls;
import com.smartdeltasystems.dataaccess.dto.StudentDto;
import com.smartdeltasystems.service.serviceapi.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Tag(name = "Student", description = "Методы для взаимодействия c студентами")
public class StudentController {

    private final StudentService studentService;

    @Operation(summary = "Метод возвращает всех студентов")
    @GetMapping(Urls.Student.GetStudentList.FULL)
    public List<StudentDto> getAllStudent() {
        return studentService.getAll();
    }

    @Operation(summary = "Метод обновляет студента")
    @PostMapping(Urls.Student.StudentId.PostStudent.FULL)
    public void updateStudent(@RequestBody StudentDto studentDto, @PathVariable String studentId) {
        studentService.updateStudent(studentDto, studentId);
    }

    @Operation(summary = "Метод создает студента")
    @PutMapping(Urls.Student.PutStudent.FULL)
    public String createStudent(@RequestBody StudentDto studentDto) {
        return studentService.createStudent(studentDto);
    }

    @Operation(summary = "Метод удаляет студента")
    @DeleteMapping(Urls.Student.StudentId.DeleteStudent.FULL)
    public void deleteStudent(@PathVariable String studentId) {
        studentService.deleteStudent(studentId);
    }
}
