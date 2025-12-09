package com.example.demo.bean;


import java.util.List;

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
    
 // One Provider → Many Claims
    @OneToMany(mappedBy = "provider", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Claims> claims;
    
    @OneToMany(mappedBy = "provider")
    private List<ProviderNetwork> providerNetworks;

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

	public List<Claims> getClaims() {
		return claims;
	}

	public void setClaims(List<Claims> claims) {
		this.claims = claims;
	}

	public List<ProviderNetwork> getProviderNetworks() {
		return providerNetworks;
	}

	public void setProviderNetworks(List<ProviderNetwork> providerNetworks) {
		this.providerNetworks = providerNetworks;
	}


}