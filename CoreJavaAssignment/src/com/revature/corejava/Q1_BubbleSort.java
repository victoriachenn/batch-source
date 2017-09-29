package com.revature.corejava;

public class Q1_BubbleSort {

	public static void main(String[] args) { // main method to execute the method
		int[] arr1 = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 }; // initiates the desired array to sort
		BSort(arr1); // calls the function, with the integer array as an argument
	}

	/*
	 * defines the function static so that it doesn't need to instantiate the class
	 * void because it will print the sorted array, has no need for a return
	 */
	public static void BSort(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < (arr.length - 1); i++) { // iterates through each pair of numbers
				if (arr[i] > arr[i + 1]) { // when the left is greater, they swap
					int holder = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = holder;
				}
			}
		}
	/*
	 * the loop to swap is nested in another loop that performs those iterations
	 * arr.length times in order to accommodate the maximum required value movement
	 * (if the lowest number is in the last position)
	 * 
	 * after these two loops arr is sorted
	 * 
	 * the function then calls on a function to print the array
	 */

		printArray(arr);
	}

	/*
	 * defines the function static again so that Q1_Sort need not be instantiated
	 * will print the sorted array, has no need for a return
	 */
	public static void printArray(int[] arr) {
		String str = ""; // creates an empty string
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				str = str + arr[i];
			} // last value is added to the string but doesn't have a space after it
			else {
				str = str + arr[i] + " ";
			} // everything else is added to the string with a space after
		}
		System.out.println(str); // when the string includes all the indices, it is printed
	}

}
