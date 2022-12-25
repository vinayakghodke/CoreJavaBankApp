package com.bank.signup;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class UserSignUpDetails {

	public UserSignUpDetails() {} // default constructor
	
	// Function for 2nd and further customers
	public void userDataSignUp() {
		FileWriter fw = null;
		BufferedReader br2;
	try {
		
	 br2 = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter Your Name: ");
	String name = br2.readLine();
	System.out.print("Enter Your Mobile Number: ");
	String mob_no = br2.readLine();
	System.out.print("Enter Your Deposit Amount: ");
	String dep_amt = br2.readLine();
		
	fw = new FileWriter("master.txt", true);
	RefIdGenerator r1 = new RefIdGenerator();
	int ref_id = r1.refIdGen();
	String refId = Integer.toString(ref_id);
	System.out.println("Hello " + name + " Your account is successfully created...");
	System.out.println("Thanks For Signing Up & Your Reference id is: " + refId );
	fw.write(refId);
	fw.write("#");
	fw.write(name);
	fw.write("#");
	fw.write(mob_no);
	fw.write("#");
	fw.write(dep_amt);
	fw.write("\n");
	}
	catch(Exception e) {
		e.printStackTrace();
					}
	
	finally {
		try {
		fw.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	}
}
