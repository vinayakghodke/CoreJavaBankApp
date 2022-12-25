package com.bank.signup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FirstSignUp {
	public FirstSignUp() {}
	// Declaring variables 
	FileReader fr;
	BufferedReader br;
	BufferedReader br2;
	StringTokenizer st;
	FileWriter fw;
	
	// function for 1st user to sign up
	public void signupdatacoll(){
		try {
		
			fr = new FileReader("master.txt");
			br = new BufferedReader(fr);
			String data = br.readLine();
			fw = new FileWriter("master.txt", true);
			// if there is no data in text file then this block will execute
			if (data == null) {
				
				br2 = new BufferedReader(new InputStreamReader(System.in));
				fw.write("1001");
				fw.write("#");
				System.out.print("Enter Your Name: ");
				String name = br2.readLine();
				System.out.print("Enter Your Mobile Number: ");
				String mob_no = br2.readLine();
				System.out.print("Enter Your Deposit Amount: ");
				String dep_amt = br2.readLine();
				System.out.println("Hello " + name + " Your account is successfully created");
				System.out.println("Thanks For Signing Up & Your Reference id is:  1001");
				fw.write(name);
				fw.write("#");
				fw.write(mob_no);
				fw.write("#");
				fw.write(dep_amt);
				fw.write("\n");
			}
	// if data is already present in text file then this block will execute		
			else {
				UserSignUpDetails usid = new UserSignUpDetails();
			 usid.userDataSignUp();
				
			}	
		}
		
		// handling exception and closing the file
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

