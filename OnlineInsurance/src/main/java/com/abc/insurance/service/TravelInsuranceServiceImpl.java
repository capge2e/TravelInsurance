package com.abc.insurance.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.insurance.entity.TravelInsurance;
import com.abc.insurance.repository.TravelInsuranceRepository;

@Service
public class TravelInsuranceServiceImpl implements TravelInsuranceService{

	@Autowired
	TravelInsuranceRepository travelInsuranceRepository;
	
	@Override
	@Transactional
	public TravelInsurance insertTravelInsuranc(TravelInsurance travelInsurance) throws Exception {

		TravelInsurance savedInsurance = travelInsuranceRepository.save(travelInsurance);
		if(savedInsurance != null)
		{
			return savedInsurance;
		}
		else return null;
	}


	@Override
	public TravelInsurance updateTravelInsurance(TravelInsurance travelInsurance) throws Exception {
		
		
		return travelInsuranceRepository.save(travelInsurance);
	}
	

	
	@Override
	public List<TravelInsurance> getAllTravelInsurance() throws Exception {
		
		List<TravelInsurance> allInsurances = (List<TravelInsurance>) travelInsuranceRepository.findAll();
		
		return allInsurances;
	}

	@Override
	public List<TravelInsurance> getTravelInsuranceByPremium(int premium) throws Exception {
		
		
		return travelInsuranceRepository.getTravelInsuranceByPremium(premium);
	}




	@Override
	public TravelInsurance getTravelInsuranceByUserName(String userName) throws Exception {
		
		return travelInsuranceRepository.getTravelInsuranceByUserName(userName);
	}


	@Override
	public TravelInsurance getTravelInsuranceByAge(String age) throws Exception {
		
		return travelInsuranceRepository.getTravelInsuranceByage(age);
	}


	@Override
	public TravelInsurance getTravelInsuranceByLocation(String location) throws Exception {
		
		return travelInsuranceRepository.getTravelInsuranceByLocation(location);
	}


	@Override
	public TravelInsurance getTravelInsuranceById(int id) throws Exception {
		
		 return travelInsuranceRepository.getTravelInsuranceById(id);
	}



}
