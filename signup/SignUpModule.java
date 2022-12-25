package com.bank.signup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.bank.signin.UserSignIn;
public class SignUpModule {

	public SignUpModule() {}
	
	// accepting value from user and Calling respective functions
	public int userValue() {
		int option = 0;
		BufferedReader br1;
		//do {
		// Simple user interactive format
		System.out.println("\t \t \t !! Welcome To ABC Bank !!");
		System.out.println("1. Sign Up");
		System.out.println("2. Sign In");
		System.out.println("3. Exit");
		// to get input from user and calling respective function and handling proper exceptions
		try {
		
			br1 = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Please Enter Your Choice: ");
			 option = (int) br1.read();
			 
			switch(option) {
			case '1' :
				// here user is signing up for account
				 System.out.println("Plaese Fill the following Details for Sign-UP:");
				 FirstSignUp rf = new FirstSignUp();
				 rf.signupdatacoll();
				 // Again calling for same method 
				 SignUpModule s1 = new SignUpModule();
				 s1.userValue();
				 break;
			 
			case '2' : 
				// Ref id is validated here and user is using bank functions
				 System.out.println("Please enter Your Reference Id for login: ");
				 UserSignIn us = new UserSignIn();
				 us.refIdValidator();
				 break;
			 
			case '3' : 
				// exit from program
				 System.out.println("Thanks for using our Services!!!!!");
				 break;
		
				 default:
					 // if user is entering any wrong value again function is called 
					 System.out.println("!!!Please enter correct Option!!!");
					SignUpModule s2 = new SignUpModule();
					 s2.userValue();
					 break;
		}
				}
		
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		//while (option != '3');
				return option;
	}
	
}
