package com.sapient.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sapient.vo.Emp;

public class EmpService {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.getMessage();
		}
	}

	EmpService() {

	}

	public Emp getEmployee(int eid) throws EmpNotFoundException {
		Emp emp = null;
		try {

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(url, "SYSTEM", "sapient123");
			String sql = "Select eid,ename,sal from sap_emp where eid=?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, eid);
			ResultSet res = st.executeQuery();
			res.next();
			if (res!=null) {
				emp = new Emp(res.getInt("eid"), res.getString("ename"), res.getDouble("sal"));
			}

		} catch (SQLException e) {
			e.getMessage();
		}

		if (emp == null)
			throw new EmpNotFoundException();
		return emp;
	}

}
