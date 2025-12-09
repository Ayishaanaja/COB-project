package com.example.demo.bean;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table

public class Settlement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long settlementId;   // Primary Key

    @OneToOne
    @JoinColumn(name = "claim_id", nullable = false)
    private Claims claim;   // FK → Claims

    @Column(nullable = false)
    private Double primaryInsurerPayment;

    @Column(nullable = false)
    private Double secondaryInsurerPayment;

    @Column(nullable = false)
    private Double patientResponsibility;

    @Column(nullable = false)
    private LocalDate settlementDate;

	public Long getSettlementId() {
		return settlementId;
	}

	public void setSettlementId(Long settlementId) {
		this.settlementId = settlementId;
	}

	public Claims getClaim() {
		return claim;
	}

	public void setClaim(Claims claim) {
		this.claim = claim;
	}

	public Double getPrimaryInsurerPayment() {
		return primaryInsurerPayment;
	}

	public void setPrimaryInsurerPayment(Double primaryInsurerPayment) {
		this.primaryInsurerPayment = primaryInsurerPayment;
	}

	public Double getSecondaryInsurerPayment() {
		return secondaryInsurerPayment;
	}

	public void setSecondaryInsurerPayment(Double secondaryInsurerPayment) {
		this.secondaryInsurerPayment = secondaryInsurerPayment;
	}

	public Double getPatientResponsibility() {
		return patientResponsibility;
	}

	public void setPatientResponsibility(Double patientResponsibility) {
		this.patientResponsibility = patientResponsibility;
	}

	public LocalDate getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(LocalDate settlementDate) {
		this.settlementDate = settlementDate;
	}
}

