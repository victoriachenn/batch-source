package com.revature.corejava;

public class Q3_ReverseString {

	public static void main(String[] args) {
		// stringReverse("hello");
		// stringReverse("world");
		// stringReverse("hello world, this string is reversed");
		// test cases
	}

	public static void stringReverse(String str) {
		char[] charArray = new char[str.length()]; // creates an array and loop puts each character into it
		for (int i = 0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
		}
		char[] swappedArray = new char[str.length()]; // creates another array to contain the reverse of the first
		for (int j = 0; j < str.length(); j++) { // enters each letter in the opposite character position, 
													// based on wordlength
			swappedArray[j] = charArray[str.length() - j - 1];
		}
		printArray(swappedArray); // returns the reversed array
	}

	public static void printArray(char[] arr) {
		String str = ""; // creates an empty string
		for (int i = 0; i < arr.length; i++) { // concatenates all of the elements into a String
			str = str + arr[i];
		}
		System.out.println(str); // when the string includes all the indices, it is printed
	}
}
