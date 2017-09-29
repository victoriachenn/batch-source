package com.revature.corejava;

public class Q2_Fibonacci {
	
	
	public static void main(String[] args) {  
		fib(25); // main method calls fib method with n=25, where fib(n) lists n fibonacci numbers
	}
	
	public static int Nfib(int n) { //Nfib finds the nth number in the fibonnaci sequence 
		if(n == 1) { //second term is 1
			return 1;
		}
		if(n == 0 ) {
			return 1; //first term is 1
		}
		else {
			return Nfib(n-1)+Nfib(n-2); //everything other term is the sum of the two numbers before it 
		}
	}
	
	public static void fib(int n) { //fib prints a sequence of n fibonnaci numbers
		for(int i = 0; i<n; i++) {
			if (i==n) {
				System.out.print(Nfib(i)); //the last number stands alone, no comma and space
			}
			else {
				System.out.print(Nfib(i)+", "); // every other number is followed by a comma and space
			}
		}
	}
}
