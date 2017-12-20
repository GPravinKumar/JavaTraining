package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Join {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "SYSTEM", "Sapient123");
		String sql = "SELECT e.eid, e.ename, e.sal, d.dname FROM sap_emp e INNER JOIN sap_dept d ON d.did=e.dept_id";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getInt("eid")+" ");
			System.out.print(rs.getString("ename")+" ");
			System.out.print(rs.getDouble("sal")+" ");
			System.out.println(rs.getString("dname"));
		}
		conn.close();

	}

}
