package com.example.demo.bean;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "InsurancePolicies")
@Data
public class Insurance_policies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PolicyID")
    private Long policyId;

    // FK → Patients (One Patient → Many Policies)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PatientID", nullable = false)
    private Patient patient;

    // FK → Insurers (One Insurer → Many Policies)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "InsurerID", nullable = false)
    private Insurers insurer;

    @Column(name = "PolicyNumber", nullable = false, unique = true, length = 50)
    private String policyNumber;

    @Column(name = "CoverageType", nullable = false, length = 20)
    private String coverageType; // Primary / Secondary

    @Column(name = "StartDate", nullable = false)
    private LocalDate startDate;

    @Column(name = "EndDate")
    private LocalDate endDate;

    @Column(name = "Deductible")
    private Double deductible;

    @Column(name = "Copay")
    private Double copay;

    @Column(name = "Coinsurance")
    private Double coinsurance;

    @Column(name = "Premium")
    private Double premium;

}

