package com.abc.insurance.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.abc.insurance.entity.TravelInsurance;

@Repository
public interface TravelInsuranceCustomRepository {

	public List<TravelInsurance> getTravelInsuranceByPremium(int premium)throws Exception;

	public TravelInsurance getTravelInsuranceByUserName(String userName) throws Exception;
	
	public TravelInsurance getTravelInsuranceByage(String age) throws Exception;
	
	public TravelInsurance getTravelInsuranceByLocation(String location) throws Exception;
	

	public TravelInsurance getTravelInsuranceById(int id) throws Exception;
	
	
}
