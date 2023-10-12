package com.adam.msstudent.domain;


import com.adam.msstudent.dtos.StudentDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "tb_student")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Student {

    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

    private Integer schoolId;

    public Student(StudentDTO data) {
        this.firstName = data.firstName();
        this.lastName = data.lastName();
        this.email = data.email();
    }
}
