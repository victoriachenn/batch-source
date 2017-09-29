package com.revature.corejava;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class Q20_DataReadOut {
	
	public static void main(String[] args) {
		dataReadOut(); 
	}
	
	public static void dataReadOut() {
		try {
			FileReader fReader = new FileReader("Data.txt"); 
			BufferedReader bReader = new BufferedReader(fReader); //accesses file, prepares to read 
			String line; //creates a string to set each read line to
			String[] creds; //creates an array to hold person's credentials
			while ((line = bReader.readLine()) != null) { //sets each line to 'line', when there is one to read
				creds = line.split(":"); //breaks line into an array, where there is a colon
				System.out.println("Name: "+creds[0]+" "+creds[1]); //prints out in nice format
				System.out.println("Age: "+creds[2]);
				System.out.println("State: "+creds[3]+" State");
				System.out.println();
			}	
			bReader.close(); //closes the buffered reader
		} catch (IOException e) {
			e.printStackTrace(); //catches exceptions e.g. if the file "Data.txt" doesn't exist 
		}
		
	}

}
