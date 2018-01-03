package com.sapient.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import com.sapient.exceptions.IDException;
import com.sapient.vo.Account;

public class DaoImpl implements IDao{

	private static Map<Integer, Account> amap;
	private static Logger logger = LoggerFactory.getLogger("sapient");
	
	static{
		logger.trace("static block called in dao");
		amap = new HashMap<Integer, Account>();
		amap.put(1001, new Account(1001, "ram", 10000));
		amap.put(1002, new Account(1002, "tom", 5000));
		amap.put(1003, new Account(1003, "sam", 3000));
		logger.debug("Hashmap initialized with 3 account instances");
	}
	
	@Override
	public Account getAccount(int aid) throws IDException {

		logger.trace("getAccount method is invoked");
		logger.debug("checking the {} against map key",aid);
		if(!amap.containsKey(aid))
			throw new IDException("ID not found");
		logger.info("Account ID {} found",aid);//aid value is substituted in {}
		return amap.get(aid);
	}

	
}
