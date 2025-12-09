package com.example.demo.bean;


import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Providers")
@Data
public class Providers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProviderID")
    private Long providerId;

    @Column(name = "Name", nullable = false, length = 100)
    private String name;

    @Column(name = "Specialty", length = 100)
    private String specialty;

    @Column(name = "ContactInfo", length = 255)
    private String contactInfo;

    @Column(name = "BillingSystemID")
    private Long billingSystemId;
    
 // One Provider → Many Claims
    @OneToMany(mappedBy = "provider", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Claims> claims;
    
    @OneToMany(mappedBy = "provider")
    private List<ProviderNetwork> providerNetworks;


}