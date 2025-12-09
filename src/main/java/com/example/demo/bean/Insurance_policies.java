package com.example.demo.bean;

import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.List;
@Entity
@Table(name = "InsurancePolicies")
public class Insurance_policies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PolicyID")
    private Long policyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PatientID", nullable = false)
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "InsurerID", nullable = false)
    private Insurers insurer;

    @Column(name = "PolicyNumber", nullable = false, unique = true, length = 50)
    private String policyNumber;

    @Column(name = "CoverageType", nullable = false, length = 20)
    private String coverageType;

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

    public Long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Insurers getInsurer() {
		return insurer;
	}

	public void setInsurer(Insurers insurer) {
		this.insurer = insurer;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getCoverageType() {
		return coverageType;
	}

	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Double getDeductible() {
		return deductible;
	}

	public void setDeductible(Double deductible) {
		this.deductible = deductible;
	}

	public Double getCopay() {
		return copay;
	}

	public void setCopay(Double copay) {
		this.copay = copay;
	}

	public Double getCoinsurance() {
		return coinsurance;
	}

	public void setCoinsurance(Double coinsurance) {
		this.coinsurance = coinsurance;
	}

	public Double getPremium() {
		return premium;
	}

	public void setPremium(Double premium) {
		this.premium = premium;
	}

	public List<ClaimInsuranceMapping> getClaimInsuranceMappings() {
		return claimInsuranceMappings;
	}

	public void setClaimInsuranceMappings(List<ClaimInsuranceMapping> claimInsuranceMappings) {
		this.claimInsuranceMappings = claimInsuranceMappings;
	}

	// One Policy → Many ClaimInsuranceMappings
    @OneToMany(mappedBy = "insurancePolicy", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClaimInsuranceMapping> claimInsuranceMappings;
}
