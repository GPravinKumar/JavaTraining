package com.sapient.service;

import java.util.ArrayList;
import java.util.List;

public class EmpMemDao implements Idao{
	
	EmpMemDao(){
		//instance cannot be created in another package
		
	}


	@Override
	public List<String> viewEmployee() {
		System.out.println("EmpMemDao instance");
		List<String> lst = new ArrayList<String>();
		lst.add("rama");
		lst.add("vikas");
		lst.add("tarun");
		return lst;
	}

}