package com.sapient.dao;

import com.sapient.exceptions.IDException;
import com.sapient.vo.Account;

public interface IDao {

	public Account getAccount(int aid)throws IDException;
}
