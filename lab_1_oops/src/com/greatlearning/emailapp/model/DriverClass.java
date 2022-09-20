package com.greatlearning.emailapp.model;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		  
	      final String[] depts= {"Technical","Human Resources","Admin","Legal"};
	      System.out.println(" Enter your First Name");
	      Scanner sc= new Scanner(System.in); 
	      String fname= sc.next(); 
	      System.out.println(" Enter your last Name");
	      Scanner sc1= new Scanner(System.in);
	      String lname= sc1.next(); 
	      System.out.println("Choose you department from below list:");
	      for(int i=0; i<depts.length; i++)
	      {
	          System.out.println(i+1 + "." + depts[i]);
	      }
	      System.out.println(" Enter your Department Number:");
	      Scanner sc2= new Scanner(System.in);
	      int deptNumber= sc2.nextInt();
	      String deptName="new";
	      
	      
	      switch (deptNumber) {
	      case 1:
	    	  deptName= depts[0];
	        break;
	      case 2:
	    	  deptName= depts[1];
	        break;
	      case 3:
	    	  deptName= depts[2];
	        break;
	      case 4:
	    	  deptName= depts[3];
	        break;
	    }
	      
	      Employee e=new Employee(fname, lname);
	      e.setDeptt(deptName);
	      
	      CredentialService cs=new CredentialService();
	      String email= cs.generateEmail(fname, lname, deptName);
	      e.setEmailId(email);
	      String pass= cs.generatePassword();
	      
	      e.setPassword(pass);
	      cs.showCredentials(e);
	      
	      
	   
	      
	      
		}
}
