package com.Microservice.School.Controller;

import com.Microservice.School.Entity.School;
import com.Microservice.School.Service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/school")
public class SchoolController {
    @Autowired
    SchoolService schoolService;
    @PostMapping
    public School createSchool(@RequestBody School school){
        return this.schoolService.createSchool(school);
    }
}
