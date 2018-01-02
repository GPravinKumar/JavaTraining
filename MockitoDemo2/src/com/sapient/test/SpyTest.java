package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import name.falgout.jeffrey.testing.junit5.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class SpyTest {

	@SuppressWarnings("unchecked")
	@Test
	public void m1() {
		List<String> lst = Mockito.mock(List.class);// mock does not works on real
													// implementation
		lst.add("ram");
		lst.add("tom");
		System.out.println(lst.size());
		//assertTrue(lst.size() == 2);
		assertTrue(lst.size() == 0);
	}

	@Test
	public void m2() {
		List<String> lst = Mockito.spy(new ArrayList<>());// spy is used to work on
															// real
															// implementation
		lst.add("ram");
		lst.add("tom");
		System.out.println(lst.size());
		assertTrue(lst.size() == 2);
	}

	@Test
	public void m3() {
		List<String> lst = Mockito.spy(new ArrayList<>());// spy is used to work on
															// real
															// implementation
															// and also enables
															// stubbing
		Mockito.when(lst.size()).thenReturn(100);
		System.out.println(lst.size());
		assertTrue(lst.size() == 100);
	}

}
