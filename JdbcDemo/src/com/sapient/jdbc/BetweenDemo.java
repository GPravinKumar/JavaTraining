package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BetweenDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lowest range");
		double minSal = scan.nextDouble();
		System.out.println("Enter the highest range");
		double maxSal = scan.nextDouble();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "SYSTEM", "Sapient123");
		String sql = "select * from sap_emp where sal between ? and ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setDouble(1, minSal);
		st.setDouble(2, maxSal);
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getInt("eid")+" ");
			System.out.print(rs.getString("ename")+" ");
			System.out.print(rs.getDouble("sal")+" ");
			System.out.print(rs.getInt("dept_id")+" ");
			System.out.println(rs.getDate("doj"));
		}
		conn.close();
		scan.close();

	}

}
