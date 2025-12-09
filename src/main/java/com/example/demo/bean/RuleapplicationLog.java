package com.example.demo.bean;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table

public class RuleapplicationLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logId;   // Primary Key

    @ManyToOne
    @JoinColumn(name = "claim_id", nullable = false)
    private Claims claim;   // FK → Claims

    @ManyToOne
    @JoinColumn(name = "rule_id", nullable = false)
    private COBRules cobRule;   // FK → COBRules

    @Column(nullable = false)
    private String appliedResult;   // e.g., "Primary = Policy A, Secondary = Policy B"

    @Column(nullable = false)
    private LocalDateTime timestamp; // When the rule was applied

	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public Claims getClaim() {
		return claim;
	}

	public void setClaim(Claims claim) {
		this.claim = claim;
	}

	public COBRules getCobRule() {
		return cobRule;
	}

	public void setCobRule(COBRules cobRule) {
		this.cobRule = cobRule;
	}

	public String getAppliedResult() {
		return appliedResult;
	}

	public void setAppliedResult(String appliedResult) {
		this.appliedResult = appliedResult;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
}
