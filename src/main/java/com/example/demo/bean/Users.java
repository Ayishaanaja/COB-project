package com.example.demo.bean;

import jakarta.persistence.*;
@Entity
@Table
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, unique = true)
    private String loginCredentials;  // hashed password

    @Column(nullable = false)
    private String role;       // Patient, Provider, Insurer, Admin

    @Column(nullable = false)
    private Long associatedEntityId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getUsername() {

		return loginCredentials.split(":")[0];

		}

		public String getPassword() {

		return loginCredentials.split(":")[1];
		}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Long getAssociatedEntityId() {
		return associatedEntityId;
	}

	public void setAssociatedEntityId(Long associatedEntityId) {
		this.associatedEntityId = associatedEntityId;
	}
}


