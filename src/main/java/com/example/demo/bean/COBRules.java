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

    // One Rule → Many RuleApplicationLogs
    @OneToMany(mappedBy = "cobRule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RuleapplicationLog> ruleApplicationLogs;
}


