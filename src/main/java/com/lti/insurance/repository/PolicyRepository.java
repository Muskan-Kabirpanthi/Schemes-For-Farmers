package com.lti.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.insurance.model.Claim;
import com.lti.insurance.model.Insurance;
import com.lti.insurance.model.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy,Integer>{
	public List<Policy> findPolicyByEmailId(String email);
}
