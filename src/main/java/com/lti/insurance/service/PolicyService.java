package com.lti.insurance.service;

import java.util.List;

import com.lti.insurance.model.Policy;


public interface PolicyService {
	public List<Policy> getAllPolicy();
	public boolean addPolicy(Policy policy);
	public boolean updatePolicy(Policy policy);
	public boolean deletePolicy(Policy policy);
	public int generatePolicyId();
	public boolean addPolicyByWeb(Policy policy);
	public List<Policy> findPolicyByEmail(String email);
}