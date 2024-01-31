package com.cts.app;

import java.util.Iterator;
import java.util.List;

import com.cts.dao.EmployeeDao;
import com.cts.dao.EmployeeDaoImplCollection;
import com.cts.entity.Employee;
public class EmployeeUI {

	private static EmployeeDao dao = new EmployeeDaoImplCollection();

	public static void main(String[] args) {

		storeEmployees();
		displayAllEmployee();

		System.out.println();
		findAllOrderByName();
		System.out.println();
		findAllOrderBySalary();
	}

	private static void findAllOrderBySalary() {
		List<Employee> findAll = dao.findAllOrderBySalary();

		for (Iterator<Employee> iterator = findAll.iterator(); iterator.hasNext();) {

			System.out.println(iterator.next());
		}
		
	}

	private static void findAllOrderByName() {
		List<Employee> findAll = dao.findAllOrderByName();

		for (Iterator<Employee> iterator = findAll.iterator(); iterator.hasNext();) {

			System.out.println(iterator.next());
		}

	}

	private static void displayAllEmployee() {
		List<Employee> findAll = dao.findAll();

		for (Iterator<Employee> iterator = findAll.iterator(); iterator.hasNext();) {

			System.out.println(iterator.next());
		}

	}

	private static void storeEmployees() {
		Employee e1 = new Employee(101, "Mr. E1", 5000);
		Employee e2 = new Employee(102, "Mr. E2", 4000);
		Employee e3 = new Employee(103, "Mr. E3", 8000);

		dao.addEmployee(e1);
		dao.addEmployee(e2);
		dao.addEmployee(e3);

	}

}
