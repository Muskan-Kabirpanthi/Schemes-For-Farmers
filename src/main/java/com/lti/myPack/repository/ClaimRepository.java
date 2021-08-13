package com.lti.myPack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.myPack.model.Claim;

import java.util.List;

@Repository
public interface ClaimRepository extends JpaRepository<Claim,Integer>{
	public List<Claim> findClaimByEmailId(String email);
	public List<Claim> findClaimByStatus(String status);
}