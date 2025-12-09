package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Insurance_policies;

@Repository
public interface InsurancePolicyRepository extends JpaRepository<Insurance_policies,Long> {

}
