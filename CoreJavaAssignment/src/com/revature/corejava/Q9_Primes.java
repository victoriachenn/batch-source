package com.revature.corejava;

import java.util.ArrayList;

public class Q9_Primes {

	public static void main(String[] args) {
		printPrimes(100);
	}

	public static ArrayList<Integer> printPrimes(int size) {
		ArrayList<Integer> nums = new ArrayList<Integer>(size);
		for (int i = 1; i < size + 1; i++) { // creates an ArrayList with numbers from 1 to size
			nums.add(i);
		}

		for (int n : nums) { // iterates through numbers in the ArrayList
			if (n == 2) { // 2 is prime but does not meet the criteria of the for-loop below
				System.out.print(n + " "); // so it is printed individually if it's in the ArrayList
			}
			for (int j = 2; j < n; j++) { // nested for loop checks if any other numbers in the array are prime
				if (n % j == 0) { // checks if any of the numbers less than the number make the condition
									// (n % j == 0) true, indicating that they are a factor of n
					j = n; // if they find a factor, j is set to n so that the nested loop stops, and the
							// main loop goes on to check the next number in the ArrayList
				} else {
					if (j == (n - 1)) { // if the loop checking for factors makes it to the last iteration
										// j has not been set to n and the number has no factors
						System.out.print(n + " "); // the number is printed

					}
				}
			}
		}

		return nums; //the original ArrayList is returned
	}
}
