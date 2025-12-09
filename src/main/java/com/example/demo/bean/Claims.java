package com.example.demo.bean;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Claims")
@Data
public class Claims {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ClaimID")
    private Long claimId;

    // FK → Patients
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PatientID", nullable = false)
    private Patient patient;

    // FK → Providers
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProviderID", nullable = false)
    private Providers provider;

    @Column(name = "ClaimDate", nullable = false)
    private LocalDate claimDate;

    @Column(name = "ClaimAmount", nullable = false)
    private Double claimAmount;

    @Column(name = "Status", nullable = false, length = 50)
    private String status; // Submitted, Processed, Settled

    // Claims ↔ InsurancePolicies (Many-to-Many via ClaimInsuranceMapping)
    @ManyToMany
    @JoinTable(
        name = "ClaimInsuranceMapping",
        joinColumns = @JoinColumn(name = "ClaimID"),
        inverseJoinColumns = @JoinColumn(name = "PolicyID")
    )
    private List<Insurance_policies> insurancePolicies;

    // Claims ↔ Settlements (One-to-One)
    @OneToOne(mappedBy = "claim", cascade = CascadeType.ALL, orphanRemoval = true)
    private Settlement settlement;
}
