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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PatientID", nullable = false)
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProviderID", nullable = false)
    private Providers provider;

    @Column(name = "ClaimDate", nullable = false)
    private LocalDate claimDate;

    @Column(name = "ClaimAmount", nullable = false)
    private Double claimAmount;

    @Column(name = "Status", nullable = false, length = 50)
    private String status;

    @Column(name = "IsNetwork", nullable = false)
    private boolean isNetwork;

    // One Claim → Many ClaimInsuranceMappings
    @OneToMany(mappedBy = "claim", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClaimInsuranceMapping> claimInsuranceMappings;

    @OneToOne(mappedBy = "claim", cascade = CascadeType.ALL, orphanRemoval = true)
    private Settlement settlement;
    
 // One Claim → Many RuleApplicationLogs
    @OneToMany(mappedBy = "claim", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RuleapplicationLog> ruleApplicationLogs;

}
