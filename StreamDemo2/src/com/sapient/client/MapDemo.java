package com.sapient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.sapient.util.EmpUtil;
import com.sapient.vo.Emp;

public class MapDemo {

	public static void main(String[] args) {
		
		List<Emp> lst=new ArrayList<Emp>();
		lst.add(new Emp(1002,"afsal",650000));
		lst.add(new Emp(1003,"babu",360000));
		lst.add(new Emp(1004,"pravin",480000));
		lst.add(new Emp(1001,"jaydeep",530000));
		lst.add(new Emp(1005,"ganesh",610000));
		
		Stream<Emp> s= lst.stream().map(e->{e.setEsal(e.getEsal()+e.getEsal()*0.1);return e;});
		s.forEach(EmpUtil::display);
		System.out.println("-------------------------------------------------");
		lst.forEach(EmpUtil::display);
		

	}

}
