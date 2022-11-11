package com.abc.insurance.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abc.insurance.entity.TravelInsurance;
import com.abc.insurance.service.TravelInsuranceService;

@RestController
@RequestMapping("/TI")
public class TravelInsuranceWebController {

	@Autowired
	TravelInsuranceService travelInsuranceService;

	public TravelInsuranceWebController() {
		
		System.out.println("\n\n\n======>> Inside Constructor"+this);
		
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<String> addTravelInsurance(@RequestBody TravelInsurance travelInsurance)

	{
		try {
			
			TravelInsurance savedInsurance =   travelInsuranceService.insertTravelInsuranc(travelInsurance);
			
			String responseMsg = savedInsurance.getUserName()+" save with Id "+savedInsurance.getId();
			
			return new ResponseEntity<String>(responseMsg,HttpStatus.OK);
		
		} catch (Exception e) {
			
			String errorMsg =  "Contact to Travel Agency 1800-250-960 or mail us :- travelagency@insurance.com";
		
			return new ResponseEntity<String>(errorMsg,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	

	@GetMapping("/allusers")
	public List<TravelInsurance> getAllInsurance()
	{
		try {
			List<TravelInsurance> allInsuranceUsers = travelInsuranceService.getAllTravelInsurance();
			
			return allInsuranceUsers;
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
		
	}
	
	@PutMapping("/update")
	public TravelInsurance updateTravelInsurance(@RequestBody TravelInsurance travelInsurance) throws Exception
	{
		
		return travelInsuranceService.updateTravelInsurance(travelInsurance);
		
		
	}
	
	
	
	@GetMapping("/IPremium/{premium}")
	public List< TravelInsurance> getTravelInsuranceByPremium(@PathVariable int premium) throws Exception
	{

		return  travelInsuranceService.getTravelInsuranceByPremium(premium);

	}
	
	@GetMapping("/IName/{userName}")
	public TravelInsurance getTravelInsuranceByUserName(@PathVariable String userName) throws Exception
	{

		return  travelInsuranceService.getTravelInsuranceByUserName(userName);

	}
	
	@GetMapping("/IAge/{age}")
	public TravelInsurance getTravelInsuranceByage(@PathVariable String age) throws Exception
	{

		return  travelInsuranceService.getTravelInsuranceByAge(age);

	}
	

	@GetMapping("/ILocation/{location}")
	public TravelInsurance getTravelInsuranceByLocation(@PathVariable String location) throws Exception
	{

		return  travelInsuranceService.getTravelInsuranceByAge(location);

	}
	
}
