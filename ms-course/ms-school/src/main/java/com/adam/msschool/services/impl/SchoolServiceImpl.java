package com.adam.msschool.services.impl;

import com.adam.msschool.domain.School;
import com.adam.msschool.dtos.SchoolDTO;
import com.adam.msschool.repositories.SchoolRepository;
import com.adam.msschool.services.interfaces.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;


    @Override
    public School createSchool(SchoolDTO schoolDTO){
        School newSchool = new School(schoolDTO);

        this.saveSchool(newSchool);

        return newSchool;
    }

    @Override
    public List<School> findAllSchools(){
        return schoolRepository.findAll();
    }

    @Override
    public void saveSchool(School school) {
        this.schoolRepository.save(school);
    }
}
