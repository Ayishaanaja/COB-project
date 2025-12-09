package com.example.demo.bean;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "AuditLogs")
public class AuditLogs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LogID")
    private Long logId;

    @Column(name = "EntityName", nullable = false, length = 50)
    private String entityName; // Patient, Claim, Policy, etc.

    @Column(name = "EntityID", nullable = false)
    private Long entityId;

    @Column(name = "Action", nullable = false, length = 20)
    private String action; // Insert, Update, Delete

    @Column(name = "Timestamp", nullable = false)
    private LocalDateTime timestamp;

    @Column(name = "UserID", nullable = false)
    private Long userId;

	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public Long getEntityId() {
		return entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}

