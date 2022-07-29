package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class CalculatorTest {
	
	public Calculator calculator;
	
	//@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before class");
	}
	
	//@AfterClass
	public static void afrerClass()
	{
		System.out.println("After class");
	}
	
	@Before
	public void setUp()
	{
		calculator = new Calculator();
		
		System.out.println("Before test method");
	}
	
	@After
	public void setDown()
	{
		calculator = null;
		
		System.out.println("after test method");
	}
	
	@Test
	public void testAdd()
	{
		calculator.add(30, 40);
		
		assertEquals(70, calculator.add(30, 40));
		
		System.out.println("Test method");
	}

}
