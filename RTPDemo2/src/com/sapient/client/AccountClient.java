package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Account;
import com.sapient.service.Loan;
import com.sapient.service.Saving;

public class AccountClient {
	private static Account[] arr = new Account[2];
	static {
		arr[0] = new Saving(1001, "ram", 5000);
		arr[1] = new Loan(1002, "amith", 25000);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String opt = null;
		int acType = 0;
		double amt = 0;
		do {
			System.out.println("Enter acc type 0--savings, 1--loan");
			acType = scan.nextInt();
			if (acType < 0 || acType > 1) {
				System.out.println("Invalid Input");
			} else {
				System.out.println("Enter amount to deposit : ");
				amt = scan.nextDouble();
				arr[acType].deposit(amt);
				arr[acType].display();
			}
			System.out.println("Press Y to continue");
			opt = scan.next();
		} while (opt.equals("y"));
		scan.close();

	}

}
