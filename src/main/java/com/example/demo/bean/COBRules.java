package com.example.demo.bean;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "COBRules")
public class COBRules {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RuleID")
    private Long ruleId;

    @Column(name = "RuleName", nullable = false, length = 100)
    private String ruleName;

    @Column(name = "Description", length = 255)
    private String description;

    @Column(name = "PriorityOrder")
    private Integer priorityOrder;

    public Long getRuleId() {
		return ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPriorityOrder() {
		return priorityOrder;
	}

	public void setPriorityOrder(Integer priorityOrder) {
		this.priorityOrder = priorityOrder;
	}

	public List<RuleapplicationLog> getRuleApplicationLogs() {
		return ruleApplicationLogs;
	}

	public void setRuleApplicationLogs(List<RuleapplicationLog> ruleApplicationLogs) {
		this.ruleApplicationLogs = ruleApplicationLogs;
	}

	// One Rule → Many RuleApplicationLogs
    @OneToMany(mappedBy = "cobRule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RuleapplicationLog> ruleApplicationLogs;
}


