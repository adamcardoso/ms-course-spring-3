package com.adam.msstudent.controllers;


import com.adam.msstudent.domain.Student;
import com.adam.msstudent.dtos.StudentDTO;
import com.adam.msstudent.services.interfaces.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody StudentDTO studentDTO) {
        Student newStudent = studentService.createStudent(studentDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(newStudent);
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAllStudents(){
        return ResponseEntity.ok(studentService.findAllStudents());
    }
}
