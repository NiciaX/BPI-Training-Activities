package com.bpi.training.M4Activity7;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountClass bac = new BankAccountClass();

		BankAccountClass.runTest(()-> bac.deposit(5000),"Deposit");
		BankAccountClass.runTest(() -> bac.withdraw(3000), "Withdrawal");
		BankAccountClass.runTest(() -> bac.deposit(-500), "Deposit");
		BankAccountClass.runTest(() -> bac.withdraw(20000), "Withdrawal");
		BankAccountClass.runTest(() -> bac.deposit(60000), "Deposit");
		
	}
}
