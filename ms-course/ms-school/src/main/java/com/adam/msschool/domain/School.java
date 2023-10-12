package com.adam.msschool.domain;

import com.adam.msschool.dtos.SchoolDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "tb_school")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class School {
    @Id
    private Integer id;
    private String name;
    private String email;

    public School(SchoolDTO data){
        this.name = data.name();
        this.email = data.email();
    }
}
