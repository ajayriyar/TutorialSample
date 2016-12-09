package com.tutorial.sample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

public class PFServiceTest {
	
	@Mock
	SalaryService salaryService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(2000, getBasicPay());
	}
	
		
	private double getBasicPay(){
		if(getGrossSalary()>10000){
			return (getGrossSalary())*40/1000;
		}else {
			return (getGrossSalary()*20)/1000;
		}
	}
	
	private double getGrossSalary(){
		double grossPay=10000;
		return grossPay;
	}
	
	private int getLeave(){
		int leave=2;
		return leave;
	}
	
	private double getLoan(){
		double loan=20000;
		return loan;
	}
	

}
