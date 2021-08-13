package com.lti.myPack.controller;

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

import com.lti.myPack.model.Policy;
import com.lti.myPack.service.PolicyService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping("/policyRest/api")
public class PolicyController {

	@Autowired
	PolicyService policyService;

	@GetMapping("/generatePolicyId")
	public int generatePolicyId() {
		return policyService.generatePolicyId();
	}

	@GetMapping("/policies")
	public List<Policy> getAllPolicy() {
		return policyService.getAllPolicy();
	}

	@PostMapping("/policies")
	public boolean addPolicy(@RequestBody Policy policy) {
		return policyService.addPolicy(policy);
	}

	@PostMapping("policyFromWeb")
	public boolean addPolicyByWeb(@RequestBody Policy policy) {
		return policyService.addPolicyByWeb(policy);
	}

	@PutMapping("/policies")
	public boolean updatePolicy(@RequestBody Policy policy) {
		return policyService.updatePolicy(policy);
	}

	@DeleteMapping("/policies")
	public boolean deletePolicy(@RequestBody Policy policy) {
		return policyService.deletePolicy(policy);
	}

	@GetMapping("/PolicyByEmail/{email}")
	public List<Policy> findPolicyByEmail(@PathVariable(value = "email") String email) {
		return policyService.findPolicyByEmail(email);
	}

}