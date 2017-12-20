package com.sapient.serialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//import java.util.Scanner;

public class SerializeDemo {

	public static void main(String[] args) throws IOException {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter employee id:");
//		int eid=scan.nextInt();
//		System.out.println("Enter employee name:");
//		String name=scan.next();
//		System.out.println("Enter employee sal:");
//		double sal=scan.nextDouble();
		
		FileOutputStream fos = new FileOutputStream("emp.txt"/*,true*/);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Emp emp1 =new Emp(1001, "ram", 60000);
		Emp emp2 =new Emp(1002, "tom", 45000);
		Emp emp3 =new Emp(1003, "sam", 50000);
		oos.writeObject(emp1);
		oos.writeObject(emp2);
		oos.writeObject(emp3);
		oos.close();
		fos.close();
		//scan.close();
		System.out.println("Serialized");

	}

}
