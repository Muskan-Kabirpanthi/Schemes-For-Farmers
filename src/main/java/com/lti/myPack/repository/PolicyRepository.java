package com.lti.myPack.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.myPack.model.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy,Integer>{
	public List<Policy> findPolicyByEmailId(String email);
}
