package com.sapient.dao;

import java.util.ResourceBundle;

import com.sapient.dao.Idao;

public class DaoFactory {
	private static ResourceBundle rb;
	private static Idao dao;

	static {
		rb = ResourceBundle.getBundle("sap");
		try {
			Class cls = Class.forName(rb.getString("cname"));// load the class
			dao = (Idao) cls.newInstance();// create instance
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static Idao getDaoInstance() {
		return dao;
	}

}
