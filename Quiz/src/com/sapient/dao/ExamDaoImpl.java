package com.sapient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.sapient.vo.Questions;

public class ExamDaoImpl implements Idao {

	private static Idao dao = new ExamDaoImpl();

	private ExamDaoImpl() {

	}

	public static Idao getDaoInstance() {
		return dao;
	}

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Map<Integer, Questions> viewQuestions() {
		Map<Integer, Questions> map = new HashMap<>();
		Questions ques = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try (Connection conn = DriverManager.getConnection(url, "SYSTEM", "Sapient123")) {
			String sql = "SELECT * FROM questions";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				ques = new Questions(rs.getInt("qid"), rs.getString("qdesc"), rs.getString("optionA"),
						rs.getString("optionB"), rs.getString("optionC"), rs.getString("answer"));
				map.put(ques.getQid(), ques);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return map;
	}

}
