package com.cts.app;

import java.util.List;

import com.cts.dao.EmployeeDao;
import com.cts.dao.EmployeeDaoImplCollection;
import com.cts.entity.Employee;

public class Main {
	public static void main(String[] args) {		
			EmployeeDao dao=new EmployeeDaoImplCollection();
			
			List<Employee> list = dao.findAll();
	}
}
