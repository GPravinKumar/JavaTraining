package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.Palindrome;

@RunWith(JUnitPlatform.class)
public class PalindromeTest {
	
	private static Palindrome ser;
	
	@BeforeAll
	public static void beforeAll(){
		ser = new Palindrome();
	}
	@AfterAll
	public static void afterAll(){
		ser = null;
	}
	@Test
	public void testPal1(){
		assertFalse(ser.checkPalindrome("rama"));		
	}
	@Test
	public void testPal2(){
		assertTrue(ser.checkPalindrome("nitin"));		
	}
	@Test
	public void testPal3(){
		assertFalse(ser.checkPalindrome(null));		
	}
	@Test
	public void testPal4(){
		assertTrue(ser.checkPalindrome("malayalam"));		
	}
	@Test
	public void testPal5(){
		assertFalse(ser.checkPalindrome(""));		
	}

}
