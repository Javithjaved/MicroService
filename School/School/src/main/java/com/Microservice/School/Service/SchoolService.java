package com.Microservice.School.Service;

import com.Microservice.School.Entity.School;
import com.Microservice.School.Repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {
    @Autowired
    SchoolRepository schoolRepository;

    public School createSchool(final School school) {
        return this.schoolRepository.save(school);
    }
}
