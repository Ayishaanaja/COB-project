package com.example.demo.bean;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
=======

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Providers")
@Data
>>>>>>> 8fd3d8a3ee92c7de259c1eecfea8e030a019517e
public class Providers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    private Long providerId;

    @Column(nullable = false)
    private String name;

    @Column
    private String specialty;

    @Column
    private String contactInfo;

    @Column
    private String billingSystemId;
}
=======
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

}
>>>>>>> 8fd3d8a3ee92c7de259c1eecfea8e030a019517e
