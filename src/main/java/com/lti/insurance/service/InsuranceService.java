package com.lti.insurance.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.lti.insurance.model.Insurance;
import com.lti.insurance.model.Policy;


public interface InsuranceService {
	public List<Insurance> getInsurances();
	public boolean addInsurance(Insurance insurance);
	public boolean updateInsurance(Insurance insurance);
	public boolean deleteInsurance(Insurance insurance);
	public List<Insurance> findInsuranceByCropType(String cropType);
}
