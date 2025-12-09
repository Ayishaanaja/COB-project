package com.example.demo.bean;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Insurers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "insurer_id")
    private Long insurerId;   

    @Column(nullable = false, length = 100)
    private String name;      

    @Column(length = 255)
    private String contactInfo; 

    @Column(nullable = false, length = 50)
    private String type;   
}
