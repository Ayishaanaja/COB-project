package com.example.demo.bean;

<<<<<<< HEAD

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Providers")
@Data
=======
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
>>>>>>> 32af3dfe2d74beb409f2859d685eb08d757400e4
public class Providers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
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
=======
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
>>>>>>> 32af3dfe2d74beb409f2859d685eb08d757400e4
