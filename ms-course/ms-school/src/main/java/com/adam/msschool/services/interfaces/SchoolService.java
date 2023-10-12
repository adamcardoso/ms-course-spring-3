package com.adam.msschool.services.interfaces;

import com.adam.msschool.domain.School;
import com.adam.msschool.dtos.SchoolDTO;

import java.util.List;

public interface SchoolService {

    School createSchool(SchoolDTO schoolDTO);

    List<School> findAllSchools();

    void saveSchool(School school);
}
