package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.sapient.dao.IDao;
import com.sapient.service.ISer;
import com.sapient.service.SerImpl;
import com.sapient.vo.Emp;

import name.falgout.jeffrey.testing.junit5.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class EmpTest {

	@Mock
	IDao dao;

	@InjectMocks
	ISer ser = new SerImpl();

	static List<Emp> idList;
	static List<Emp> nameList;
	static List<Emp> salList;

	static Emp e1 = new Emp(1003, "ram", 9000);
	static Emp e2 = new Emp(1006, "tom", 29000);
	static Emp e3 = new Emp(1007, "sam", 32000);
	static Emp e4 = new Emp(1002, "raj", 56000);

	@BeforeAll
	public static void beforeAll() {

		idList = new ArrayList<>();
		idList.add(e4);
		idList.add(e1);
		idList.add(e2);
		idList.add(e3);

		nameList = new ArrayList<>();
		nameList.add(e4);
		nameList.add(e1);
		nameList.add(e3);
		nameList.add(e2);

		salList = new ArrayList<>();
		salList.add(e1);
		salList.add(e2);
		salList.add(e3);
		salList.add(e4);
	}

	@BeforeEach
	public void beforeEach() {

		List<Emp> lst = new ArrayList<>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		lst.add(e4);

		when(dao.getEmployee()).thenReturn(lst);
	}

	@Test
	public void testEmp1() {

		List<Emp> actual = ser.viewEmployee("id");
		assertEquals(idList, actual);
		// verify(dao,times(0)).getEmployee();//here the verify() checks whether
											  //the method is invoked or not when times(0) 
											  //is used then it checks whether the method is 
											  //invoked for 0 times.Since the method is invoked
											  //once it will show error.

	}

	@Test
	public void testEmp2() {

		List<Emp> actual = ser.viewEmployee("id");
		assertTrue(actual.size() == idList.size());
	}

	@Test
	public void testEmp3() {

		List<Emp> actual = ser.viewEmployee("name");
		assertEquals(nameList, actual);

	}

	@Test
	public void testEmp4() {

		List<Emp> actual = ser.viewEmployee("name");
		assertTrue(actual.size() == nameList.size());
	}

	@Test
	public void testEmp5() {

		List<Emp> actual = ser.viewEmployee("sal");
		assertEquals(salList, actual);

	}

	@Test
	public void testEmp6() {

		List<Emp> actual = ser.viewEmployee("sal");
		assertTrue(actual.size() == salList.size());
	}

	@Test
	public void testEmp7() {

		assertNull(ser.viewEmployee("aaa"));

	}

}
