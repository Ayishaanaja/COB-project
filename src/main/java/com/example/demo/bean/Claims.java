package com.example.demo.bean;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
@Entity
@Table(name = "Claims")

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

    public Long getClaimId() {
		return claimId;
	}

	public void setClaimId(Long claimId) {
		this.claimId = claimId;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Providers getProvider() {
		return provider;
	}

	public void setProvider(Providers provider) {
		this.provider = provider;
	}

	public LocalDate getClaimDate() {
		return claimDate;
	}

	public void setClaimDate(LocalDate claimDate) {
		this.claimDate = claimDate;
	}

	public Double getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(Double claimAmount) {
		this.claimAmount = claimAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isNetwork() {
		return isNetwork;
	}

	public void setNetwork(boolean isNetwork) {
		this.isNetwork = isNetwork;
	}

	public List<ClaimInsuranceMapping> getClaimInsuranceMappings() {
		return claimInsuranceMappings;
	}

	public void setClaimInsuranceMappings(List<ClaimInsuranceMapping> claimInsuranceMappings) {
		this.claimInsuranceMappings = claimInsuranceMappings;
	}

	public Settlement getSettlement() {
		return settlement;
	}

	public void setSettlement(Settlement settlement) {
		this.settlement = settlement;
	}

	public List<RuleapplicationLog> getRuleApplicationLogs() {
		return ruleApplicationLogs;
	}

	public void setRuleApplicationLogs(List<RuleapplicationLog> ruleApplicationLogs) {
		this.ruleApplicationLogs = ruleApplicationLogs;
	}

	// One Claim → Many ClaimInsuranceMappings
    @OneToMany(mappedBy = "claim", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClaimInsuranceMapping> claimInsuranceMappings;

    @OneToOne(mappedBy = "claim", cascade = CascadeType.ALL, orphanRemoval = true)
    private Settlement settlement;
    
 // One Claim → Many RuleApplicationLogs
    @OneToMany(mappedBy = "claim", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RuleapplicationLog> ruleApplicationLogs;

}
