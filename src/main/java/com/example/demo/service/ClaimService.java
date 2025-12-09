package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ClaimRepository;

@Service
public class ClaimService {

@Autowired
public ClaimRepository cr;
}
