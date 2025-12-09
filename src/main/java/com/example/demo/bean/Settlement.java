package com.example.demo.bean;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
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
}

