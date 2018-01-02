package com.sapient.test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.sapient.dao.IDao;
import com.sapient.exceptions.BalException;
import com.sapient.exceptions.IDException;
import com.sapient.service.ISer;
import com.sapient.service.SerImpl;
import com.sapient.vo.Account;

import name.falgout.jeffrey.testing.junit5.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class TransferTest {

	@Mock // old style IDao dao=Mockito.mock(IDao.class);
	IDao dao;

	@InjectMocks
	ISer ser = new SerImpl();

	private static Account acc1, acc2, acc3;

	@BeforeAll
	public static void beforeAll() {
		acc1 = new Account(1001, "ram", 10000);
		acc2 = new Account(1002, "tom", 5000);
		acc3 = new Account(1003, "sam", 2000);

	}

	@AfterAll
	public static void afterAll() {
		acc1 = null;
		acc2 = null;
		acc3 = null;
	}

	@SuppressWarnings("unchecked")
	@BeforeEach
	public void beforeEach() throws IDException {
		when(dao.getAccount(1001)).thenReturn(acc1);// this part is called
													// stubbing
		when(dao.getAccount(1002)).thenReturn(acc2);
		when(dao.getAccount(1003)).thenReturn(acc3);
		when(dao.getAccount(1004)).thenThrow(IDException.class);
	}

	@Test
	public void testFund1() throws BalException, IDException {
		assumeTrue(ser != null);
		assertAll("transfer fund", () -> assertTrue(ser.transferFund(1001, 1002, 5000)),
				() -> assertEquals(5000, acc1.getBal()), () -> assertEquals(10000, acc2.getBal()));
	}

	@Test
	public void testFund2() throws BalException, IDException {
		assumeTrue(ser != null);
		assertThrows(BalException.class, () -> ser.transferFund(1003, 1002, 5000));
	}

	@Test
	public void testFund3() throws BalException, IDException {
		assumeTrue(ser != null);
		assertThrows(IDException.class, () -> ser.transferFund(1003, 1004, 10000));
	}
	
	@Test
	public void testFund4() throws BalException, IDException {
		assumeTrue(ser != null);
		assertThrows(BalException.class, () -> ser.transferFund(1001, 1002, 6000));
	}

}
