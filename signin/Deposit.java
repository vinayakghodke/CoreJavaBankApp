package com.bank.signin;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Deposit {

	double depMoney = 0;
	BufferedReader br;
	BufferedReader br1;
	FileReader fr;
	StringTokenizer st = null;
	String data;
	FileWriter fw;
	double prevBalance;
	
	void deposit_mon() {
		System.out.print("Please Enter Amount that you want to Deposit: ");
		
		try {
			double bal = 0;
		br = new BufferedReader(new InputStreamReader(System.in));
		depMoney = Double.parseDouble(br.readLine());
		
//		UserSignIn u = new UserSignIn();
		prevBalance = UserSignIn.mon;
		System.out.println(prevBalance);
//		System.out.println(u.getMon());
		fr = new FileReader("mastercopy.txt");
			br1 = new BufferedReader(fr);
			data = br1.readLine();
		
			while(data != null) {
				st = new StringTokenizer(data,"#");
				
				while(st.hasMoreElements()) {
					st.nextToken();
					st.nextToken();
					st.nextToken();
					 bal = Double.parseDouble(st.nextToken());
					// System.out.println(bal);
						fw = new FileWriter("mastercopy.txt", true);
						fw.write(String.valueOf(bal));
				 
		}
				data = br1.readLine();
				//System.out.println(prevBalance);
				if(prevBalance == bal) {
					bal = bal + depMoney;
					System.out.println("Your amount is successfully deposited!!");
					System.out.println(bal);
//					fw = new FileWriter("mastercopy.txt", true);
//					fw.write(String.valueOf(bal));
					
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		SignInModule sm = new SignInModule();
		sm.showSignInModule();
}
	}

