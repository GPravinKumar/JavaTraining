package com.sapient.client;

import com.sapient.client.SalesPerson;

public class Sales {

	public static void main(String[] args) {
		SalesPerson s1 = new SalesPerson(1001, "ram", 45000);
		SalesPerson s2 = new SalesPerson(1002, "tom", 18000);
		SalesPerson s3 = new SalesPerson(1003, "sam", 10000);
		s1.display();
		s2.display();
		s3.display();
		System.out.println("No. Of Persons " + SalesPerson.noOfPersons);
		System.out.println("Total Sales " + SalesPerson.tsales);
		/*comments added version 2*/
	}

}
