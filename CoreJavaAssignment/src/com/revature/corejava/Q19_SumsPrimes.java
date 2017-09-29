package com.revature.corejava;

import java.util.ArrayList;

public class Q19_SumsPrimes {

	public static void main(String[] args) {
		ArrayList<Integer> arr = Array(10); // calls method to create an array
		System.out.println(sumEvens(arr)); // calls method to sum of evens
		System.out.println(sumOdds(arr)); // calls method to sum odds
		printPrimes(arr); // calls method to print primes
	}

	public static ArrayList<Integer> Array(int n) { // method returns an ArrayList, takes an int argument
		ArrayList<Integer> nums = new ArrayList<Integer>(); // creates an ArrayList
		for (int i = 0; i < n; i++) {
			nums.add(i); // adds the numbers from 0 to the int argument
		}
		return nums;
	}

	public static int sumEvens(ArrayList<Integer> nums) { // takes an ArrayList
		int sum = 0; // initializes sum
		for (int n : nums) { // for loop runs through all arguments, when (n%2 == 0) condition is true,
			if (n % 2 == 0) { // number is odd and it is added to the sum
				sum = sum + n;
			}
		}
		return sum; // for loop ends when ArrayList ends and the sum is returned
	}

	public static int sumOdds(ArrayList<Integer> nums) {
		int sum = 0;
		for (int n : nums) {
			if (n % 2 == 1) { // same as odds, but (n%2 == 1) condition true when n is odd
				sum = sum + n;
			}
		}
		return sum;
	}

	public static ArrayList<Integer> printPrimes(ArrayList<Integer> nums) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int n : nums) { // iterates through numbers in the ArrayList
			if (n == 2) {
				primes.add(n); // 2 is prime but does not meet the criteria of the for-loop below
			} // so it is added individually if it's in the ArrayList
			for (int j = 2; j < n; j++) { // nested for loop checks if any other numbers in the array are prime
				if (n % j == 0) { // checks if any of the numbers less than the number make the condition
									// (n % j == 0) true, indicating that they are a factor of n
					j = n; // if they find a factor, j is set to n so that the nested loop stops, and the
							// main loop goes on to check the next number in the ArrayList
				} else {
					if (j == (n - 1)) { // if the loop checking for factors makes it to the last iteration 
										// j has not been set to n and the number has no factors
						primes.add(n); // the number is added to an ArrayList of primes

					}
				}
			}
		}
		System.out.println(primes); // primes array is printed and returned
		return primes;
	}

}
