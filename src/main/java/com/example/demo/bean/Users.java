package com.example.demo.bean;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;   // Primary Key

    @Column(nullable = false)
    private String role;   // Patient, Provider, Insurer, Admin

    @Column(nullable = false)
    private String loginCredentials; // Could be username/password hash or token

    @Column(nullable = false)
    private Long associatedEntityId; 
    // Links to PatientID, ProviderID, or InsurerID depending on role
}

