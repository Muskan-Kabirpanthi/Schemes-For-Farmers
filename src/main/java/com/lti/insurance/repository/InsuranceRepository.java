package com.lti.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.insurance.model.Insurance;


@Repository
public interface InsuranceRepository extends JpaRepository<Insurance,Integer>{
	public List<Insurance> findInsuranceByCropType(String cropType);
}
