package com.revature.corejava;

public class Q4_Factorial {
	
	public static void main(String[] args) {
		Factorial(0);
		Factorial(1);
		Factorial(2);
		Factorial(4);
		Factorial(6);
		Factorial(26);
	}
	
	public static long nfac(int n) { //output type is long, otherwise max n = 16
		if (n>25) { // when n>25, the number is too large, overflows, and wraps around to a negative
			System.out.print("Factorial too high, please enter an argument less than: ");
			return 26;
		}
		if (n == 1) {
			return 1; //base case 1 
		}		
		if ( n == 0) {
			return 1; //base case 2
		}
		else {
			return n*nfac(n-1); //recursive statement multiplies the number, n, by the factorial of n-1 
		}
	}
	
	public static void Factorial(int n) {
		System.out.println(nfac(n)); 
	}

}
