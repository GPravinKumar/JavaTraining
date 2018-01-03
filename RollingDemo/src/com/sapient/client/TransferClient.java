package com.sapient.client;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sapient.exceptions.BalException;
import com.sapient.exceptions.IDException;
import com.sapient.service.ISer;
import com.sapient.service.SerImpl;

public class TransferClient {
	
	private static Logger logger = LoggerFactory.getLogger("sapient");
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			logger.trace("main thread starts");
			ISer ser = new SerImpl();
			logger.debug("service instance created");
			try {
				logger.info("transfer the amount Rs.5000 from account Id 1001 to 1002");
				ser.transferFund(1001, 1002, 5000);
				logger.info("successfully transferred");
			} catch (BalException | IDException e) {
				logger.error(e.getMessage(), e);
			}

			try {
				logger.info("transfer the amount Rs.5000 from account Id 1003 to 1002");
				ser.transferFund(1003, 1002, 5000);
				logger.info("successfully transferred");
			} catch (BalException | IDException e) {
				logger.error(e.getMessage(), e);
			}

			try {
				logger.info("transfer the amount Rs.5000 from account Id 1003 to 1002");
				ser.transferFund(2003, 1002, 5000);
				logger.info("successfully transferred");
			} catch (BalException | IDException e) {
				logger.error(e.getMessage(), e);
			} 
		} while (sc.next().equals("y"));
		sc.close();

	}

}
