package com.cts.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cts.entity.Employee;

public class EmployeeDaoImplCollection implements EmployeeDao {

	private List<Employee> employees = new ArrayList<>();

	@Override
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		//code
	}

	@Override
	public void deleteEmployee(Employee employee) {
		//code
	}

	@Override
	public List<Employee> findAll() {

		return employees;
	}

	@Override
	public List<Employee> findAllOrderByName() {
		Collections.sort(employees, new NameCompare());
		return employees;
	}

	@Override
	public List<Employee> findAllOrderBySalary() {

		Collections.sort(employees, new SalaryCompare());
		return employees;
	}

}
