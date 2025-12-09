package com.example.demo.bean;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table
public class Patient {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long patientId;

	    @Column(nullable = false)
	    private String name;

	    @Column(nullable = false)
	    private LocalDate dob;

	    @Column(length = 10)
	    private String gender;

	    @Column
	    private String contactInfo;

	    @Column(nullable = false)
	    private Double outOfPocketMax;

	    @Column(nullable = false)
	    private Double currentOutOfPocketSpent;
	    
	    @OneToMany(mappedBy = "patient")
	    private List<Insurance_policies> insurancePolicies;

	    @OneToMany(mappedBy = "patient")
	    private List<Claims> claims;

		public Long getPatientId() {
			return patientId;
		}

		public void setPatientId(Long patientId) {
			this.patientId = patientId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public LocalDate getDob() {
			return dob;
		}

		public void setDob(LocalDate dob) {
			this.dob = dob;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getContactInfo() {
			return contactInfo;
		}

		public void setContactInfo(String contactInfo) {
			this.contactInfo = contactInfo;
		}

		public Double getOutOfPocketMax() {
			return outOfPocketMax;
		}

		public void setOutOfPocketMax(Double outOfPocketMax) {
			this.outOfPocketMax = outOfPocketMax;
		}

		public Double getCurrentOutOfPocketSpent() {
			return currentOutOfPocketSpent;
		}

		public void setCurrentOutOfPocketSpent(Double currentOutOfPocketSpent) {
			this.currentOutOfPocketSpent = currentOutOfPocketSpent;
		}

		public List<Insurance_policies> getInsurancePolicies() {
			return insurancePolicies;
		}

		public void setInsurancePolicies(List<Insurance_policies> insurancePolicies) {
			this.insurancePolicies = insurancePolicies;
		}

		public List<Claims> getClaims() {
			return claims;
		}

		public void setClaims(List<Claims> claims) {
			this.claims = claims;
		}

}
