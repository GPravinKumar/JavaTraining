package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.CalcService;

@RunWith(JUnitPlatform.class)//we have to annotate at class level
public class CalcTest {
	
	@Tag("prod")
	@Test
	public void seriesTest1(){
		CalcService ser = new CalcService();
		double expected = 10.0;
		double actual = ser.calcSeries(5,5,10);
		assertEquals(expected,actual);
	}
	
	@Tag("dev")
	@Test
	public void seriesTest2(){
		CalcService ser = new CalcService();
		double expected = 7.5;
		double actual = ser.calcSeries(5,5,5);
		assertEquals(expected,actual);
	}
	
}
