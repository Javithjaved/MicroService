package com.Microservice.School.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "school")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "school_id", updatable = false, nullable = false)
    private Long id;
    @Column(name = "schoolname")
    private String schoolname;
    @Column(name = "location")
    private String location;

}
