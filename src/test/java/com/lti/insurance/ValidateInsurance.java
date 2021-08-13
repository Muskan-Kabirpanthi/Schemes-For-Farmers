package com.lti.insurance;

import java.util.List;

import com.lti.insurance.model.*;
import com.lti.insurance.service.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class ValidateInsurance {

	@Autowired
	InsuranceImpl insuranceImpl=new InsuranceImpl();
	@Test
	void test() {
		List<Insurance> insurances=insuranceImpl.findInsuranceByCropType("Zaid");
		for (Insurance insurance : insurances) {
			System.out.println(insurance);
		}
	}
	@Test
	void test2() {
		List<Insurance> insurances=insuranceImpl.findInsuranceByCropType("adshbj");
		for (Insurance insurance : insurances) {
			System.out.println(insurance);
		}
	}
	@Test
	void test3() {
		List<Insurance> insurances=insuranceImpl.findInsuranceByCropType("Rabi");
		for (Insurance insurance : insurances) {
			System.out.println(insurance);
		}
	}
	@Test
	void test4() {
		List<Insurance> insurances=insuranceImpl.getInsurances();
		for (Insurance insurance : insurances) {
			System.out.println(insurance);
		}
	}

}
