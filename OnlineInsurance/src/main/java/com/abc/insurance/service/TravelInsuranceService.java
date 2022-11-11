package com.abc.insurance.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.abc.insurance.entity.TravelInsurance;

@Service
public interface TravelInsuranceService {
	
	public TravelInsurance insertTravelInsuranc(TravelInsurance travelInsurance )throws Exception;

	public List<TravelInsurance> getAllTravelInsurance()throws Exception;
	
	public List<TravelInsurance> getTravelInsuranceByPremium(int premium) throws Exception;


	public TravelInsurance getTravelInsuranceByUserName(String userName) throws Exception;

	public TravelInsurance getTravelInsuranceByAge(String age) throws Exception;

	public TravelInsurance getTravelInsuranceByLocation(String location) throws Exception;
	

	public TravelInsurance getTravelInsuranceById(int id) throws Exception;
	

	public TravelInsurance updateTravelInsurance(TravelInsurance travelInsurance)throws Exception;
	

}
