package com.greatlearning.emailapp.model;

import java.util.Random;

public class CredentialService extends Employee {

	CredentialService ()
	{
		super(firstName, lastName);
	}
	public String generateEmail(String fname,String lname, String deptt)
	{	
		String domain="greatlearning.com";
		String email=fname+lname+"@"+deptt+"."+domain;
		return email;	
	}
	
	public String generatePassword()
	{
		Random a= new Random();
		StringBuilder s= new StringBuilder();
		for(int j=0; j<8;j++)
		{
			int i=a.nextInt(127-32)+32;
			s.append((char)i);
			
		}
		return s.toString();
	}
	public void showCredentials(Employee e)
	{
		System.out.println("Dear " +e.firstName + " your generated credentials are as follows");

		System.out.println("Email---->" + e.emailId);
		System.out.println("Password---->"+e.password);
		
	}

	
}
