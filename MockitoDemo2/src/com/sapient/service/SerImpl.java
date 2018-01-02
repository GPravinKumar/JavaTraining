package com.sapient.service;

import java.util.Comparator;
import java.util.List;

import com.sapient.dao.IDao;
import com.sapient.vo.Emp;

public class SerImpl implements ISer {

	private IDao dao;

	public void setDao(IDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Emp> viewEmployee(String order) {
		List<Emp> lst = dao.getEmployee();
		Comparator<Emp> idcomp = (e1,e2)->((Integer)e1.getEid()).compareTo((Integer)e2.getEid());
		Comparator<Emp> salcomp = (e1,e2)->((Double)e1.getSal()).compareTo((Double)e2.getSal());
		if(order.equals("id")){
			lst.sort(idcomp);
		}else if(order.equals("name")){
			lst.sort((e1,e2)->(e1.getEname()).compareTo(e2.getEname()));
		}else if(order.equals("sal")){
			lst.sort(salcomp);
		}else{
			return null;
		}
		return lst;
	}

}
