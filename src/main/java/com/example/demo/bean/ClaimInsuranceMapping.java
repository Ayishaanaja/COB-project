package com.example.demo.bean;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ClaimInsuranceMapping")
@Data
public class ClaimInsuranceMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ClaimInsuranceID")
    private Long claimInsuranceId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ClaimID", nullable = false)
    private Claims claim;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PolicyID", nullable = false)
    private Insurance_policies insurancePolicy;

    @Column(name = "IsPrimary", nullable = false)
    private Boolean isPrimary;

    @Column(name = "AppliedDeductible")
    private Double appliedDeductible;

    @Column(name = "AppliedCoinsurance")
    private Double appliedCoinsurance;

    @Column(name = "AppliedCopay")
    private Double appliedCopay;

    @Column(name = "AmountPaidByInsurer")
    private Double amountPaidByInsurer;
}
