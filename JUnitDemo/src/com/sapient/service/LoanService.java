package com.sapient.service;

public class LoanService {
	
	
	public String approveLoan(int age,double income)throws AgeException, IncomeException{
		if(age>=20 && age<=40)
			if(income>=400000)
				return "approved";
			else
				throw new IncomeException("Income Must be greater than 4 Lakhs");
		else
			throw new AgeException("Age must be between 20 and 40");
	}

}
