package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Settlement;

@Repository
public interface SettlementRepository extends JpaRepository<Settlement,Long>{

}
