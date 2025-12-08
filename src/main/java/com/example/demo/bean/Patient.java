package com.example.demo.bean;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Patient {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long patientId;

	    @Column(nullable = false)
	    private String name;

	    @Column(nullable = false)
	    private LocalDate dob;

	    @Column(length = 10)
	    private String gender;

	    @Column
	    private String contactInfo;

	    @Column(nullable = false)
	    private Double outOfPocketMax;

	    @Column(nullable = false)
	    private Double currentOutOfPocketSpent;

}
