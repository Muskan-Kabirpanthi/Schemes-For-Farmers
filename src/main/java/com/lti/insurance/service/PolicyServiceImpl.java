package com.lti.insurance.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.insurance.model.Insurance;
import com.lti.insurance.model.Policy;
import com.lti.insurance.repository.PolicyRepository;

@Service
@Transactional
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	PolicyRepository policyRepository;
	@Override
	public List<Policy> getAllPolicy() {
		return policyRepository.findAll();
	}

	@Override
	public boolean addPolicy(Policy policy) {
		policyRepository.save(policy);
		return true;
	}

	@Override
	public boolean updatePolicy(Policy policy) {
		Policy newPolicy=policyRepository.findById(policy.getPolicyId()).get();
		newPolicy=policy;
		policyRepository.save(newPolicy);
		return true;
	}

	@Override
	public boolean deletePolicy(Policy policy) {
		policyRepository.delete(policy);
		return true;
	}

	@Override
	public int generatePolicyId() {
		List<Policy> allPolicy=policyRepository.findAll();
		int max=1;
		for(Policy policy:allPolicy)
		{
			if(max<policy.getPolicyId())
				max=policy.getPolicyId();
		}
		return (max+1);
	}

	@Override
	public boolean addPolicyByWeb(Policy policy) {
		System.out.println(policy);
		policy.setPolicyId(this.generatePolicyId());
		System.out.println(policy);
		policyRepository.save(policy);
		return true;
	}

	@Override
	public List<Policy> findPolicyByEmail(String email) {
		return policyRepository.findPolicyByEmailId(email);
	}

//	@Override
//	public List<Policy> findPolicyByCropType(String cropType) {	
//		return policyRepository.findPolicyByCropType(cropType);
//	}

}
