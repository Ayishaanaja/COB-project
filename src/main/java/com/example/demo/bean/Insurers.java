package com.example.demo.bean;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
public class Insurers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "insurer_id")
    private Long insurerId;   

    @Column(nullable = false, length = 100)
    private String name;      

    @Column(length = 255)
    private String contactInfo; 

    @Column(nullable = false, length = 50)
    private String type;

	public Long getInsurerId() {
		return insurerId;
	}

	public void setInsurerId(Long insurerId) {
		this.insurerId = insurerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}   
}
