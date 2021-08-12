package com.lti.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.insurance.model.Claim;

@Repository
public interface ClaimRepository extends JpaRepository<Claim,Integer>{
	public List<Claim> findClaimByEmailId(String email);
	public List<Claim> findClaimByStatus(String status);
}
