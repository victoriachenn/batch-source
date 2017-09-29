package com.revature.corejava;

public class Q6_Integer {

	public static void main(String[] args) {
		isInt(8);
		isInt(8.5);
		isInt("cat");
		isInt(true);
		isInt(0);
	}

	/*
	 * method takes an object and checks its type, if the type is int, if the type
	 * is int, the method returns true, otherwise it returns false
	 */

	public static void isInt(Object obj) {
		if (obj instanceof Integer) {
			System.out.println(obj + " is an integer");
		} else {
			System.out.println(obj + " is not an integer");
		}
	}

}
