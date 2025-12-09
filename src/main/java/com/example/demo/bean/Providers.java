package com.example.demo.bean;


import jakarta.persistence.*;

@Entity
@Table(name = "Providers")
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

    // --- Constructors ---
    public Providers() {}

    // --- Getters and Setters ---
    public Long getProviderId() {
        return providerId;
    }

    public void setProviderId(Long providerId) {
        this.providerId = providerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Long getBillingSystemId() {
        return billingSystemId;
    }

    public void setBillingSystemId(Long billingSystemId) {
        this.billingSystemId = billingSystemId;
    }
}
