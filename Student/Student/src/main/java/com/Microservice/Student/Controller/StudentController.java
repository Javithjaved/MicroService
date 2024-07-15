package com.Microservice.Student.Controller;

import com.Microservice.Student.Entity.Student;
import com.Microservice.Student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public Student CreateStudent(@RequestBody Student student){
        return this.studentService.createStudent(student);
    }
    @GetMapping
    public List<Student> RetriveStudent(){
        return this.studentService.retrivestudent();
    }
}
