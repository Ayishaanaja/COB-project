package com.example.demo.bean;

import java.time.LocalDate;
import java.util.List;

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
	    
	    @OneToMany(mappedBy = "patient")
	    private List<Insurance_policies> insurancePolicies;

	    @OneToMany(mappedBy = "patient")
	    private List<Claims> claims;

}
