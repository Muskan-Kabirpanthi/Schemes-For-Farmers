package com.lti.insurance;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.insurance.service.InsuranceImpl;
import com.lti.insurance.service.InsuranceService;
import com.lti.insurance.model.*;

@SpringBootTest
class InsuranceApplicationTests {

	@Autowired
	InsuranceImpl insuranceImpl=new InsuranceImpl();
	@Test
	void contextLoads() {
		List<Insurance> insurances=insuranceImpl.findInsuranceByCropType("Zaid");
		for (Insurance insurance : insurances) {
			System.out.println(insurance);
		}
	}

}
