package com.cts.dao;

import java.util.Comparator;

import com.cts.entity.Employee;

public class SalaryCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		//Double s1 =Double.valueOf(o1.getSalary());
		//Double s2 =Double.valueOf(o2.getSalary());
		//return o1.getSalary().compareTo(o2.getSalary());		 
		 return Double.valueOf(o1.getSalary()).compareTo(Double.valueOf(o2.getSalary()));
	}

}
