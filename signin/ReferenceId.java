package com.bank.signin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


public class ReferenceId {

	public static void main(String[] args) {
		ReferenceId r1 = new ReferenceId();
		int refid = r1.getId("refid.txt");
		System.out.println(refid);
		r1.updateId(refid);
		
	}
	
	public ReferenceId() {}
	FileReader fr = null;
	BufferedReader br;
	FileWriter fw = null;
	public int id;
	
	public int getId(String fileName){

		try {
			 fr = new FileReader(fileName);
			 br = new BufferedReader(fr);
			 String refId = br.readLine();
			 id = Integer.parseInt(refId);
		 	}
		 
			 catch(Exception e) {
				 e.printStackTrace();
			 }
		 finally {
			 
			 try {
			 fr.close();
			 }
			 catch(Exception e) {
				 e.printStackTrace();
			 }
		 }
		 return id;
		}
	
	 public void updateId(int id) {
		try {
		fr = new FileReader("refid.txt");
		br = new BufferedReader(fr);
		 String data = br.readLine();
			 int refid = Integer.parseInt(data);
			 refid++;
			 String refernce = String.valueOf(refid);
			 fw = new FileWriter("refid.txt");
			 fw.write(refernce);
			 System.out.println(refernce);
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


