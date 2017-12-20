package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class AddEmp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Employee Id: ");
		int eid = scan.nextInt();
		System.out.println("Enter the Employee Name: ");
		String ename = scan.next();
		System.out.println("Enter the Employee Salary: ");
		double sal = scan.nextDouble();
		System.out.println("Enter the Employee Dept_id: ");
		int did = scan.nextInt();
		System.out.println("Enter the Employee Date: ");
		String date = scan.next();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "SYSTEM", "Sapient123");
		String sql = "insert into sap_emp values(?,?,?,?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, eid);
		st.setString(2, ename);
		st.setDouble(3, sal);
		st.setInt(4, did);
		st.setString(5, date);
		int rows  = st.executeUpdate();
		System.out.println(rows + "row affected");
		conn.close();
		scan.close();

	}


}
