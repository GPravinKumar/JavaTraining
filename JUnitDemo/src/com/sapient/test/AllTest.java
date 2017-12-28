package com.sapient.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
//import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
//to run all test case methods at same time use @SelectClasses
@SelectClasses({CalcTest.class,RoundTest.class,PalindromeTest.class,ReverseNameTest.class,LoanTest.class})
//to run all test case methods in a package at same time use @SelectPackages
//we can also add multiple packages to test
@SelectPackages("com.sapient.test")
//@IncludeTags("prod")//Only the tests tagged by name prod will run 
@ExcludeTags("prod")//The tests tagged by name prod will not run and remaining tests will run
public class AllTest {
	

}
