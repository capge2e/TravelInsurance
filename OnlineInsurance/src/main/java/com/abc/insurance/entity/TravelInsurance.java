package com.abc.insurance.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TravelInsurance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotNull(message = "Username cannot be null")
	@Size(min = 2,message = "Username is not valid, it shoult be more than 2 characters")
	private String userName;
	
	private String age;
	private String location;
	
	@PositiveOrZero(message ="Invalid Phone Number")
	private long phoneNumber;
	
	@Email(message = "Not a valid email")
	private String email;
	
	private int premium;
	
}
