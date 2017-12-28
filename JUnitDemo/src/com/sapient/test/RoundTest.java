package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.CalcService;

@RunWith(JUnitPlatform.class)
public class RoundTest {
	
	private static CalcService ser;
	@BeforeAll
	public static void beforeAll(){
		System.out.println("Before All");
		ser = new CalcService();
	}
		
	@AfterAll
	public static void afterAll(){
		System.out.println("After All");
		ser=null;
	}
	
	@BeforeEach
	public void beforeEach(){
		System.out.println("Before Each");
	}
	@AfterEach
	public void afterEach(){
		System.out.println("After Each");
	}
	
	@Test
	public void testRound1(){
		System.out.println("test1");
		double expected = 56.328;
		double actual = ser.round2N(56.3278, 3);
		assertEquals(expected, actual);
	}
	
	@Test
	@Disabled //ignores testing this method
	public void testRound2(){
		System.out.println("test2");
		double expected = 56.32;
		double actual = ser.round2N(56.3248, 2);
		assertEquals(expected, actual);
	}
	@Test
	public void testRound3(){
		System.out.println("test3");
		double expected = 56.33;
		double actual = ser.round2N(56.32768, 2);
		assertEquals(expected, actual);
	}
	@Test
	public void testRound4(){
		System.out.println("test4");
		double expected = 56.3277;
		double actual = ser.round2N(56.32768, 4);
		assertEquals(expected, actual);
	}
	@Test
	public void testRound5(){
		System.out.println("test5");
		double expected = 56;
		double actual = ser.round2N(56.3278, 0);
		assertEquals(expected, actual);
	}
	@Test
	public void testRound6(){
		System.out.println("test6");
		double expected = 56;
		double actual = ser.round2N(56.3278, 0);
		assertEquals(expected, actual);
	}

}
