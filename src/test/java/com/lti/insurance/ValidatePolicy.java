package com.lti.insurance;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

import com.lti.insurance.model.*;
import com.lti.insurance.service.*;
@SpringBootTest
class ValidatePolicy {

	@Autowired
	PolicyServiceImpl policyServiceImpl=new PolicyServiceImpl();
	
	@Test
	void test() {
		List<Policy> policies=policyServiceImpl.getAllPolicy();
		for(Policy policy:policies)
			System.out.println(policy);
	}
	@Test
	void test2() {
		int policyNo=policyServiceImpl.generatePolicyId();
		System.out.println(policyNo);
	}
}
