package com.bank.signup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class RefIdGenerator {

	static int refId;
	public RefIdGenerator() {}
	
	//Ref id generator function for 2nd and further customers 
	public int refIdGen() {
		
	FileReader fr;
	BufferedReader br;
	StringTokenizer st = null;
	String data;
	try {
		fr = new FileReader("master.txt");
		br = new BufferedReader(fr);
		data =br.readLine();
		// System.out.println("id \t name\t age\n");
		while(data != null) {
			st = new StringTokenizer(data,"#");
			
			while(st.hasMoreElements()) {
				String id = st.nextToken();
				st.nextToken();
				st.nextToken();
				st.nextToken();
	// converting string to int value			
				refId = Integer.parseInt(id);
			}
			// reading the next line of data
			data = br.readLine();
			
		}
		// every time function is called the value gets incremented
		refId++;
	} // end of try block
	catch(Exception e) {
		e.printStackTrace();
	}
	// System.out.println(refId);
	return refId;
	}
}
