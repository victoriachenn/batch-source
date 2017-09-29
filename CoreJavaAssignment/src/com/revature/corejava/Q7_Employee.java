package com.revature.corejava;

import java.util.ArrayList;
import java.util.Collections;


public class Q7_Employee {

	public static void main(String[] args) {
		Q7_Employee joan = new Q7_Employee("Joan", "HR", 58);
		Q7_Employee paul = new Q7_Employee("Paul", "IT", 45);
		compareAge(joan, paul);
		System.out.println();
		compareName(joan, paul);
		System.out.println();
		compareAge(joan, paul);
		System.out.println();
		compareDepartment(joan, paul);
	}
	
	
	String name; //creates employee fields
	String dpt;
	int age;

	Q7_Employee(String name, String dpt, int age) { //constructor setting all fields
		this.name = name;
		this.dpt = dpt;
		this.age = age;
	}

	public Q7_Employee() {
		super(); //constructor creates an employee with empty fields
		this.name = ""; 
		this.dpt = "";
		this.age = 0;
	}

	public String getName() { //field getters and setters
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDpt() {
		return dpt;
	}

	public void setDpt(String dpt) {
		this.dpt = dpt;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//method inputs two employees, adds them both to an ArrayList and then sorts them 
	public static ArrayList<Q7_Employee> compareName(Q7_Employee emp1, Q7_Employee emp2) {
		ArrayList<Q7_Employee> list = new ArrayList<Q7_Employee>(2);
		list.add(emp1);
		list.add(emp2);
		Collections.sort(list, new CompareByName()); //sorts Arraylist with compare method overriden in CompareByName class
		for(Q7_Employee e: list){
			System.out.println(e.toString()); //prints sorted employees
		}
		return list;
	}
	
	public static ArrayList<Q7_Employee> compareDepartment(Q7_Employee emp1, Q7_Employee emp2) {
		ArrayList<Q7_Employee> list = new ArrayList<Q7_Employee>(2);
		list.add(emp1);
		list.add(emp2);
		Collections.sort(list, new CompareByDepartment()); //sorts Arraylist with compare method overriden in CompareByDepartment class
		for(Q7_Employee e: list){
			System.out.println(e.toString()); //prints sorted employees
		}
		return list;
	}
	
	public static ArrayList<Q7_Employee> compareAge(Q7_Employee emp1, Q7_Employee emp2) {
		ArrayList<Q7_Employee> list = new ArrayList<Q7_Employee>(2);
		list.add(emp1);
		list.add(emp2);
		Collections.sort(list, new CompareByAge()); //sorts Arraylist with compare method overriden in CompareByAge class
		for(Q7_Employee e: list){
			System.out.println(e.toString()); //prints sorted employees
		}
		return list;
	}

	//prints an employee's info
	public String toString() {
		return ("Name: " + this.getName() + ", Department: " + this.getDpt() + ", Age: " + this.getAge());
	}
}
