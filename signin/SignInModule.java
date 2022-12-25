package com.bank.signin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.bank.signup.SignUpModule;

public class SignInModule {
	
	 void showSignInModule() {
	// Simple format for end user	 
		System.out.println("\t \t \t !! Welcome User !!");
		System.out.println("1. Deposit");
		System.out.println("2. Withdrawal");
		System.out.println("3. Reports");
		System.out.println("4. Log Out");
		
		BufferedReader br1;
		int option = 0;
		
		try {
			
			br1 = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Please Enter Your Choice: ");
			 option = (int) br1.read();
			 
			switch(option) {
			case '1' :
				 System.out.println("Welcome to Deposit Section!!!");
				System.out.println("bal is" + UserSignIn.mon );
				 Deposit d = new Deposit();
				 d.deposit_mon();
				 break;
			 
			case '2' : 
				 System.out.println("Welcome to Withdrawal Section!!! ");
				 break;
			 
			case '3' : 
				 System.out.println("Here are your Reports!!!!!");
				 break;
			case '4' :
				SignUpModule s1 = new SignUpModule();
				s1.userValue();
		
				 default:
					 System.out.println("!!!Please enter correct Option!!!");
					// SignInModule s2 = new SignInModule();
					 // s2.showSignInModule();
					  break;
		}
				}
		
		
		catch (IOException e) {
			e.printStackTrace();
		}

	}
}
