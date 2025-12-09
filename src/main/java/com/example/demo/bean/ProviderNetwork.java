package com.example.demo.bean;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table
public class ProviderNetwork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   // Primary Key

    @ManyToOne
    @JoinColumn(name = "provider_id", nullable = false)
    private Providers provider;   // FK → Providers

    @ManyToOne
    @JoinColumn(name = "insurer_id", nullable = false)
    private Insurers insurer;     // FK → Insurers

    @Column(nullable = false)
    private boolean inNetwork;   // Boolean flag (true = in-network, false = out-of-network)

    @Column
    private Double negotiatedRate; // Optional: % discount or fixed negotiated rate

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Providers getProvider() {
		return provider;
	}

	public void setProvider(Providers provider) {
		this.provider = provider;
	}

	public Insurers getInsurer() {
		return insurer;
	}

	public void setInsurer(Insurers insurer) {
		this.insurer = insurer;
	}

	public boolean isInNetwork() {
		return inNetwork;
	}

	public void setInNetwork(boolean inNetwork) {
		this.inNetwork = inNetwork;
	}

	public Double getNegotiatedRate() {
		return negotiatedRate;
	}

	public void setNegotiatedRate(Double negotiatedRate) {
		this.negotiatedRate = negotiatedRate;
	}
}
