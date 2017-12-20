package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GroupFn {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "SYSTEM", "Sapient123");
		String sql = "select sum(sal) sum,avg(sal) avg from sap_emp ";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			System.out.println("Sum = "+rs.getDouble("sum"));
			System.out.println("Avg = "+rs.getDouble("avg"));
		}
		conn.close();
	}

}
