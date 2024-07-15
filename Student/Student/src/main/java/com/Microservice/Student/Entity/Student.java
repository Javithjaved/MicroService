package com.Microservice.Student.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "student")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private Long id;
    @Column(name = "studentname")
    private String studentname;
    @Column(name = "location")
    private String location;
    @Column(name = "school_id")
    private Long School_id;
}
