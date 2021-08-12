package com.lti.insurance.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.insurance.model.Claim;
import com.lti.insurance.repository.ClaimRepository;

@Service
@Transactional
public class ClaimServiceImpl implements ClaimService {

	@Autowired
	ClaimRepository claimRepository;
	
	@Override
	public List<Claim> getClaims() {
		return claimRepository.findAll();
	}

	@Override
	public boolean addClaim(Claim claim) {
		claimRepository.save(claim);
		return true;
	}

	@Override
	public boolean updateClaim(Claim claim) {
		Claim newClaim=claimRepository.findById(claim.getClaimId()).get();
		newClaim=claim;
		claimRepository.save(claim);
		return true;
	}

	@Override
	public boolean deleteClaim(Claim claim) {
		claimRepository.delete(claim);
		return true;
	}

	@Override
	public int generateClaimId() {
		List<Claim> allClaim=claimRepository.findAll();
		int max=0;
		for(Claim claim:allClaim)
		{
			if(max<claim.getClaimId())
				max=claim.getClaimId();
		}
		return (max+1);
	}


	@Override
	public boolean addClaimByWeb(Claim claim) {
		System.out.println(claim);
		claim.setClaimId(this.generateClaimId());
		claim.setStatus("Waiting for approval");
		System.out.println(claim);
		claimRepository.save(claim);
		return true;
	}

	@Override
	public List<Claim> findClaimByEmail(String email) {
		return claimRepository.findClaimByEmailId(email);
	}

	@Override
	public List<Claim> findClaimByStatus() {
		return claimRepository.findClaimByStatus("Waiting for approval");
	}

	
}
