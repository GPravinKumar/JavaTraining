package com.sapient.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sapient.exceptions.IdException;
import com.sapient.exceptions.NotFoundException;
import com.sapient.vo.Employee;

public class EmpMemDao implements Idao {

	public static Map<Integer, Employee> emap;

	static {
		emap = new HashMap<Integer, Employee>();
		emap.put(1001, new Employee(1001, "ram", 45000, 1, LocalDate.of(2014, 7, 21)));
		emap.put(1005, new Employee(1005, "tom", 55000, 1, LocalDate.of(2015, 9, 17)));
		emap.put(1003, new Employee(1003, "sam", 33000, 1, LocalDate.of(2013, 7, 13)));
	}

	@Override
	public List<Employee> viewEmployee() {
		List<Employee> lst = new ArrayList<Employee>();
		lst.addAll(emap.values());
		return lst;
	}

	@Override
	public Employee viewEmployee(int eid) throws NotFoundException {
		if (!emap.containsKey(eid))
			throw new NotFoundException("Employee Not Found");
		Employee emp = emap.get(eid);
		return emp;
	}

	@Override
	public int addEmployee(Employee emp) throws IdException {
		if (emap.containsKey(emp.getEmpId()))
			throw new IdException("Id already Exists");
		emap.put(emp.getEmpId(), emp);
		return 1;
	}

	@Override
	public int removeEmployee(int eid) throws NotFoundException {

		return 0;
	}

	@Override
	public int updateSalary(int eid, double sal) throws NotFoundException {

		return 0;
	}

}
