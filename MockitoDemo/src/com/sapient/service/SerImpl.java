package com.sapient.service;

import com.sapient.dao.IDao;
import com.sapient.exceptions.BalException;
import com.sapient.exceptions.IDException;
import com.sapient.vo.Account;

public class SerImpl implements ISer {

	private IDao dao;

	public void setDao(IDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean transferFund(int fid, int tid, double amt) throws BalException, IDException {

		Account from = dao.getAccount(fid);
		Account to = dao.getAccount(tid);
		if (from.getBal() < amt)
			throw new BalException("no sufficient fund to transfer");
		from.setBal(from.getBal() - amt);
		to.setBal(to.getBal() + amt);
		return true;
	}

}
