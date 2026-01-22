package com.bpi.training.M4Activity8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountClass bankAcc = new BankAccountClass();

		BankAccountClass.runTest(()-> bankAcc.deposit(5000),"Deposit");
		BankAccountClass.runTest(() -> bankAcc.withdraw(3000), "Withdrawal");
		BankAccountClass.runTest(() -> bankAcc.deposit(-500), "Deposit");
		BankAccountClass.runTest(() -> bankAcc.withdraw(20000), "Withdrawal");
		BankAccountClass.runTest(() -> bankAcc.deposit(60000), "Deposit");
	}

}
