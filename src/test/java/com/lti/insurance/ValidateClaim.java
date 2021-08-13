package com.lti.insurance;

import java.util.List;

import com.lti.insurance.model.*;
import com.lti.insurance.service.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class ValidateClaim {

	@Autowired
	ClaimServiceImpl claimImpl=new ClaimServiceImpl();
	@Test
	void test() {
		int claimId=claimImpl.generateClaimId();
		System.out.println(claimId);
	}
	@Test
	void test2() {
		List<Claim> claims=claimImpl.findClaimByEmail("yash@gmail.com");
		for(Claim claim:claims)
		{
			System.out.println(claim);
		}
		
	}
	@Test
	void test3() {
		List<Claim> claims=claimImpl.findClaimByStatus();
		for(Claim claim:claims)
		{
			System.out.println(claim);
		}
	}
	@Test
	void test4() {
		List<Claim> claims=claimImpl.getClaims();
		for(Claim claim:claims)
		{
			System.out.println(claim);
		}
		
	}
	@Test
	void test5() {
		List<Claim> claims=claimImpl.findClaimByStatus();
		for(Claim claim:claims)
		{
			System.out.println(claim);
		}
		
	}
}
