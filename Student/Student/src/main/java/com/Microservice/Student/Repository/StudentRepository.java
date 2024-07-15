package com.Microservice.Student.Repository;

import com.Microservice.Student.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
