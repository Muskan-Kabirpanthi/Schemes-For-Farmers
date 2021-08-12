package com.lti.insurance.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.insurance.model.Insurance;
import com.lti.insurance.model.Policy;
import com.lti.insurance.repository.InsuranceRepository;

@Service
@Transactional
public class InsuranceImpl implements InsuranceService {

	@Autowired
	InsuranceRepository insuranceRepo;
	
	@Override
	public List<Insurance> getInsurances() {
		return insuranceRepo.findAll();
	}

	@Override
	public boolean addInsurance(Insurance insurance) {
		insuranceRepo.save(insurance);
		return true;
	}

	@Override
	public boolean updateInsurance(Insurance insurance) {
		Insurance newInsurance=insuranceRepo.findById(insurance.getInsuranceId()).get();
		newInsurance=insurance;
		insuranceRepo.save(newInsurance);
		return true;
	}

	@Override
	public boolean deleteInsurance(Insurance insurance) {
		insuranceRepo.delete(insurance);
		return true;
	}
	@Override
	public List<Insurance> findInsuranceByCropType(String cropType) 
	{	
		return insuranceRepo.findInsuranceByCropType(cropType);
	}

}
