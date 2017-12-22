package com.sapient.exception;

public class Demo2 {

	public static void main(String[] args) {
		String res = approveLoan(25, 500000);
		System.out.println(res);
	}

	public static String processLoan(int age, double income) throws AgeException, IncomeException {
		if (age < 20 || age > 40)
			throw new AgeException("Age must be between 20 and 40");
		if (income < 400000)
			throw new IncomeException("Income must be greater than or equal to 4 Lakhs");
		return "loan approved";
	}

	public static String approveLoan(int age, double income) {
		String res = null;
		try {
			res = processLoan(age, income);
			return res;
		} catch (AgeException | IncomeException e) {
			return e.getMessage();
		} finally {
			System.out.println("Finally block");
		}
	}

}
