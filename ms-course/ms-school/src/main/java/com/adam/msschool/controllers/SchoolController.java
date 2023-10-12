package com.adam.msschool.controllers;


import com.adam.msschool.domain.School;
import com.adam.msschool.dtos.SchoolDTO;
import com.adam.msschool.services.interfaces.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService schoolService;

    @PostMapping
    public ResponseEntity<School> createSchools(@RequestBody SchoolDTO schoolDTO) {
        School newSchools = schoolService.createSchool(schoolDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(newSchools);
    }

    @GetMapping
    public ResponseEntity<List<School>> findAllSchools(){
        return ResponseEntity.ok(schoolService.findAllSchools());
    }
}
