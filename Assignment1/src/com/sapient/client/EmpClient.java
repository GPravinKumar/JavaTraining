package com.sapient.client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.sapient.dao.DaoFactory;
import com.sapient.dao.Idao;
import com.sapient.exceptions.IdException;
import com.sapient.exceptions.NotFoundException;
import com.sapient.vo.Employee;

public class EmpClient {

	static Scanner scan = new Scanner(System.in);
	static Idao dao = DaoFactory.getDaoInstance();

	public static void main(String[] args) {
		String menu = null;
		String opt = null;
		Menu emenu = null;
		do {
			System.out.println("Choose: ADD   EDIT   REMOVE   VIEW   VIEWALL\n");
			menu = scan.next();
			try {
				emenu = Menu.valueOf(menu);
				processMenu(emenu);
			} catch (Exception e) {
				System.out.println("Invalid choice");
			}
			System.out.println("Press Y to continue .... ");
			opt = scan.next();
		} while (opt.equals("y"));

	}

	public static void processMenu(Menu menu) {
		switch (menu) {
		case VIEWALL:
			viewAll();
			break;
		case VIEW:
			view();
			break;
		case ADD:
			add();
			break;
		}
	}

	public static void viewAll() {
		List<Employee> lst = dao.viewEmployee();
		for (Employee emp : lst)
			System.out.println(emp);
	}

	public static void view() {
		System.out.println("Enter the Employee Id : ");
		int eid = scan.nextInt();
		try {
			Employee emp = dao.viewEmployee(eid);
			System.out.println(emp);
		} catch (NotFoundException e) {
			System.out.println("Not Found Employee");
		}
	}

	public static void add() {
		System.out.println("Enter Employee Id : ");
		int eid = scan.nextInt();
		System.out.println("Enter Employee Name : ");
		String ename = scan.next();
		System.out.println("Enter Salary: ");
		double sal = scan.nextDouble();
		System.out.println("Enter Dept_Id : ");
		int did = scan.nextInt();
		System.out.println("Enter Date(dd-MM-yyyy) : ");
		String dt = scan.next();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate doj = LocalDate.parse(dt, df);
		Employee emp = new Employee(eid,ename,sal,did,doj);
		try {
			dao.addEmployee(emp);
			System.out.println("Employee Added");
		} catch (IdException e) {
			System.out.println(e.getMessage());
		}

	}

}
