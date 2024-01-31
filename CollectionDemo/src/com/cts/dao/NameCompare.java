package com.cts.dao;

import java.util.Comparator;

import com.cts.entity.Employee;

public class NameCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
