package com.example.demo.bean;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProviderNetwork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   // Primary Key

    @ManyToOne
    @JoinColumn(name = "provider_id", nullable = false)
    private Providers provider;   // FK → Providers

    @ManyToOne
    @JoinColumn(name = "insurer_id", nullable = false)
    private Insurers insurer;     // FK → Insurers

    @Column(nullable = false)
    private boolean inNetwork;   // Boolean flag (true = in-network, false = out-of-network)

    @Column
    private Double negotiatedRate; // Optional: % discount or fixed negotiated rate
}
