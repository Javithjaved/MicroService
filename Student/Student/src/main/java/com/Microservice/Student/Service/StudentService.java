package com.Microservice.Student.Service;

import com.Microservice.Student.Entity.Student;
import com.Microservice.Student.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository  studentRepository;
    public Student createStudent(Student student) {
        return this.studentRepository.save(student);
    }

    public List<Student> retrivestudent() {
        return this.studentRepository.findAll();
    }
}
