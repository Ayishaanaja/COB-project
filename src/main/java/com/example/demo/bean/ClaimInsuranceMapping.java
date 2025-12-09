package com.example.demo.bean;

import jakarta.persistence.*;

@Entity
@Table(name = "ClaimInsuranceMapping")
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

	public Long getClaimInsuranceId() {
		return claimInsuranceId;
	}

	public void setClaimInsuranceId(Long claimInsuranceId) {
		this.claimInsuranceId = claimInsuranceId;
	}

	public Claims getClaim() {
		return claim;
	}

	public void setClaim(Claims claim) {
		this.claim = claim;
	}

	public Insurance_policies getInsurancePolicy() {
		return insurancePolicy;
	}

	public void setInsurancePolicy(Insurance_policies insurancePolicy) {
		this.insurancePolicy = insurancePolicy;
	}

	public Boolean getIsPrimary() {
		return isPrimary;
	}

	public void setIsPrimary(Boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	public Double getAppliedDeductible() {
		return appliedDeductible;
	}

	public void setAppliedDeductible(Double appliedDeductible) {
		this.appliedDeductible = appliedDeductible;
	}

	public Double getAppliedCoinsurance() {
		return appliedCoinsurance;
	}

	public void setAppliedCoinsurance(Double appliedCoinsurance) {
		this.appliedCoinsurance = appliedCoinsurance;
	}

	public Double getAppliedCopay() {
		return appliedCopay;
	}

	public void setAppliedCopay(Double appliedCopay) {
		this.appliedCopay = appliedCopay;
	}

	public Double getAmountPaidByInsurer() {
		return amountPaidByInsurer;
	}

	public void setAmountPaidByInsurer(Double amountPaidByInsurer) {
		this.amountPaidByInsurer = amountPaidByInsurer;
	}
}
