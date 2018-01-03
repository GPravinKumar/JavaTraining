package com.sapient.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sapient.dao.DaoImpl;
import com.sapient.dao.IDao;
import com.sapient.exceptions.BalException;
import com.sapient.exceptions.IDException;
import com.sapient.vo.Account;

public class SerImpl implements ISer {

	private IDao dao;
	private static Logger logger = LoggerFactory.getLogger("sapient");

	public SerImpl(){
		logger.trace("service constructor invoked");
		setDao(new DaoImpl());
		logger.info("service instance is ready with dao dependancy");
	}
	public void setDao(IDao dao) {
		logger.trace("setter setDao() invoked");
		logger.debug("injecting dao");
		this.dao = dao;
		logger.info("dao initialized");
	}

	@Override
	public boolean transferFund(int fid, int tid, double amt) throws BalException, IDException {

		logger.trace("transferFund() invoked in service");
		Account from = dao.getAccount(fid);
		logger.debug("from account retrieved");
		Account to = dao.getAccount(tid);
		logger.debug("to account retrieved");
		if (from.getBal() < amt)
			throw new BalException("no sufficient fund to transfer");
		from.setBal(from.getBal() - amt);
		to.setBal(to.getBal() + amt);
		logger.info("{} and {} accounts are updated successfully",fid,tid);
		return true;
	}

}
