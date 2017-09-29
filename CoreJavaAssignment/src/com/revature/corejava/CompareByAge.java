package com.revature.corejava;

import java.util.Comparator;

public class CompareByAge implements Comparator<Q7_Employee>  {

	@Override
	public int compare(Q7_Employee emp1, Q7_Employee emp2) {
		return emp1.age-emp2.age;
	}
	//overrides the compare method in the comparator interface
	//compares ages, returns the difference 

}
