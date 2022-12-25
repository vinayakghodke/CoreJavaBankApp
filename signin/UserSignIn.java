package com.bank.signin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UserSignIn {

	public UserSignIn() {}
	public 
	String userIn;
	static public double mon;
	
	// Function to validate the ref Id of customer
	
	public boolean refIdValidator() {
	StringTokenizer st = null;
		String data;
		String id = null;
		BufferedReader br;
			try {
			
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			
			FileReader fr = new FileReader("master.txt");
			br = new BufferedReader(fr);
			System.out.print("Enter Your Ref Id:");
			 userIn = br2.readLine();
			 // initialization
			 data =br.readLine();  
							// condition
			while(data != null) {
				st = new StringTokenizer(data,"#");
				
				while(st.hasMoreElements()) {
					id = st.nextToken();
					st.nextToken();
					st.nextToken();
				 mon = Double.parseDouble(st.nextToken());
				
			}
				// reading the next line of data (increment)
				data = br.readLine();
				// by using toString method this can be done
				if (userIn.equals(id)) {
		// if input value of user and value in text file matched then validation is done further function is called 
					SignInModule sm = new SignInModule();
					sm.showSignInModule();
				}
//				else {
//					System.out.println("Please Enter correct Reference Id!!!");
////					UserSignIn us1 = new UserSignIn();
////					us1.refIdValidator();
//				}
	}
}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	return true;
	}
	
}

