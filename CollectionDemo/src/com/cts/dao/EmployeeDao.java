package com.cts.dao;

import java.util.List;

import com.cts.entity.Employee;

public interface EmployeeDao {
	
	
	public void addEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	
	
	public List<Employee> findAll();
	public List<Employee> findAllOrderByName();	
	public List<Employee> findAllOrderBySalary();
}
