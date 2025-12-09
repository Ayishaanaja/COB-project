package com.example.demo.bean;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "COBRules")
@Data
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

    // Many-to-Many with Claims via RuleApplicationLog
    @ManyToMany
    @JoinTable(
        name = "RuleApplicationLog",
        joinColumns = @JoinColumn(name = "RuleID"),
        inverseJoinColumns = @JoinColumn(name = "ClaimID")
    )
    private List<Claims> claims;

    // --- Constructors ---
    public COBRules() {}

    public List<Claims> getClaims() {
        return claims;
    }

    public void setClaims(List<Claims> claims) {
        this.claims = claims;
    }
}

