package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Claims;

@Repository
public interface ClaimRepository extends JpaRepository<Claims,Long>{

}
