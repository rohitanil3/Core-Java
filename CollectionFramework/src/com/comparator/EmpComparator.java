package com.comparator;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if((o1.getId()<o2.getId()))
		      return -1;
		else
			return 1;
	}

}
