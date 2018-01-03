package com.sapient.service;

import com.sapient.exceptions.BalException;
import com.sapient.exceptions.IDException;

public interface ISer {

	public boolean transferFund(int fid,int tid,double amt)throws BalException,IDException;
}
