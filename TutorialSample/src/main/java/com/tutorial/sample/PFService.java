package com.tutorial.sample;

public class PFService {
	
	public Double getPF(){
		SalaryService salaryService = new SalaryService();
		Double basicSalary = salaryService.getBasicSalary(new Double(0)); 
		return (basicSalary*12)/100;
	}
}
