package com.sapient.client;

import java.util.ArrayList;
import java.util.List;

import com.sapient.util.EmpUtil;
import com.sapient.vo.Emp;

public class SortDemo {

	public static void main(String[] args) {
		
		List<Emp> lst=new ArrayList<Emp>();
		lst.add(new Emp(1002,"afsal",650000));
		lst.add(new Emp(1003,"babu",360000));
		lst.add(new Emp(1004,"pravin",480000));
		lst.add(new Emp(1001,"jaydeep",530000));
		lst.add(new Emp(1005,"ganesh",610000));
		
		
		System.out.println("sort by employee id------------");
		lst.stream().sorted().forEach(EmpUtil::display);
		
		System.out.println("sort by employee name-----------");
		lst.stream().sorted((e1,e2)->e1.getEname().compareTo(e2.getEname())).forEach(EmpUtil::display);
		
		System.out.println("sort by employee salary----------");
		lst.stream().sorted((e1,e2)->e1.getEsal().compareTo(e2.getEsal())).forEach(EmpUtil::display);
	}

}
