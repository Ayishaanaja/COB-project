package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.COBRuleRepository;

@Service
public class COBRuleEngineService {

	@Autowired 
	public COBRuleRepository cobr;
}
