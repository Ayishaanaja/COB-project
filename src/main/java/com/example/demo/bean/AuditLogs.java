package com.example.demo.bean;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "AuditLogs")
@Data
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
}

