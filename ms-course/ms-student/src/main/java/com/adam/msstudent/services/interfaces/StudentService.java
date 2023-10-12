package com.adam.msstudent.services.interfaces;

import com.adam.msstudent.domain.Student;
import com.adam.msstudent.dtos.StudentDTO;

import java.util.List;

public interface StudentService {

    Student createStudent(StudentDTO studentDTO);

    List<Student> findAllStudents();

    void saveStudent(Student student);

}
