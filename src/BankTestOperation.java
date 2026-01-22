package com.bpi.training.M4Activity8;

@FunctionalInterface
public interface  BankTestOperation {
	void execute() throws InvalidAmountException, InsufficientFundsException;
}
