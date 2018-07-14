package com.techelevator.validation.model;


import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Registration {
	
	@NotBlank(message="Email is required")
	@Email(message= "Needs to be a valid email")
	private String email;
	
	@NotBlank(message="Email is required")
	private String verifyEmail;
	
	private boolean emailMatching;
	@AssertTrue(message="Emails must match")
	public boolean isEmailMatching() {
		if (email != null) {
			return email.equals(verifyEmail);
		} else {
			return false;
		}
	}

	
	@NotBlank(message="Password is required")
	@Size(min=8, max=100, message="Password must be between 8 and 100 characters")
	private String password;
	
	@NotBlank(message="Verify password is required")
	private String verifyPassword;
	
	private boolean passwordMatching;
	@AssertTrue(message="Passwords must match")
	public boolean isPasswordMatching() {
		if (password != null) {
			return password.equals(verifyPassword);
		} else {
			return false;
		}
	}
	
	
	@NotBlank(message="First name is required")
	@Size(min=1, max=20, message="Needs to be under 20 characters")
	private String fName;
	
	@NotBlank(message="Last name is required")
	@Size(min=1, max=20, message="Needs to be under 20 characters")
	private String lName;
	
	
	
	@Min(value=1, message="You need at least 1 ticket")
	@Max(value=10, message="You can't get more than 10 tickets")
	private int numTickets;
	
	
	@NotBlank(message="A birthdate is required")
	@Pattern(regexp="^\\d{2}\\/\\d{2}\\/\\d{4}$", message="Please enter a valid birthdate" )
	private String birthDate;
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getVerifyEmail() {
		return verifyEmail;
	}


	public void setVerifyEmail(String verifyEmail) {
		this.verifyEmail = verifyEmail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getVerifyPassword() {
		return verifyPassword;
	}


	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public int getNumTickets() {
		return numTickets;
	}


	public void setNumTickets(int numTickets) {
		this.numTickets = numTickets;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public void setEmailMatching(boolean emailMatching) {
		this.emailMatching = emailMatching;
	}


	public void setPasswordMatching(boolean passwordMatching) {
		this.passwordMatching = passwordMatching;
	}
	
	
	
}

//First Name	Required, Max Length (20)
//Last Name	Required, Max Length (20)
//Email	Required, Valid Email Address
//Confirm Email	Must Match Email
//Password	Required, Minimum Length (8)
//Confirm Password	Must Match Password
//Birth Date	Required, Valid Date
//Number of Tickets	Required, Valid Range (1 to 10)