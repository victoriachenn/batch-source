package com.revature.assignment1;

import java.util.*;

public class DepartmentComparator implements Comparator <Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.department.compareTo(e2.department);
	}

}
