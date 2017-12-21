package com.sapient.dao;

import java.util.List;

import com.sapient.exceptions.IdException;
import com.sapient.exceptions.NotFoundException;
import com.sapient.vo.Employee;

public interface Idao {

	List<Employee> viewEmployee();

	Employee viewEmployee(int eid) throws NotFoundException;

	int addEmployee(Employee emp) throws IdException;

	int removeEmployee(int eid) throws NotFoundException;

	int updateSalary(int eid, double sal) throws NotFoundException;

}
