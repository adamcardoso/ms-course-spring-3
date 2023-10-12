package com.adam.msstudent.services.impl;

import com.adam.msstudent.domain.Student;
import com.adam.msstudent.dtos.StudentDTO;
import com.adam.msstudent.repositories.StudentRepository;
import com.adam.msstudent.services.interfaces.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;


    @Override
    public Student createStudent(StudentDTO studentDTO){
        Student newStudent = new Student(studentDTO);

        this.saveStudent(newStudent);

        return newStudent;
    }

    @Override
    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        this.studentRepository.save(student);
    }

    @Override
    public List<Student> findAllStudentsBySchool(Integer schoolId) {
        return studentRepository.findAllBySchoolId(schoolId);
    }
}
