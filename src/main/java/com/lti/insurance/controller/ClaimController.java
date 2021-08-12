package com.lti.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.insurance.model.Claim;
import com.lti.insurance.service.ClaimService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/claimRest/api")
public class ClaimController {
	
	@Autowired 
	ClaimService claimService;
	
	@GetMapping("/claims")
	public List<Claim> getClaims()
	{
		return claimService.getClaims();
	}
	@GetMapping("/getClaimId")
	public int getClaimId()
	{
		return claimService.generateClaimId();
	}
	@PostMapping("/claimFromWeb")
	public boolean addClaimByWeb(@RequestBody Claim claim)
	{
		return claimService.addClaimByWeb(claim);
	}
	
	@PostMapping("/claims")
	public boolean addClaim(@RequestBody Claim claim) {
		return claimService.addClaim(claim);
	}
	
	@PutMapping("/claims")
	public boolean updateClaim(@RequestBody Claim claim) {
		return claimService.updateClaim(claim);
	}
	
	@DeleteMapping("/claims")
	public boolean deleteClaim(@RequestBody Claim claim) {
		return claimService.deleteClaim(claim);
	}
	@GetMapping("/ClaimByEmail/{emailId}")
	public List<Claim> findClaimByEmail(@PathVariable(value="emailId") String email)
	{
		return claimService.findClaimByEmail(email);
	}
	@GetMapping("/ClaimByStatus")
	public List<Claim> findClaimByStatus()
	{
		return claimService.findClaimByStatus();
	}
	

}
