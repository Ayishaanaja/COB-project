package com.example.demo.bean;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
