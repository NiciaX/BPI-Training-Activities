package com.bpi.training.M4Activity7;

@FunctionalInterface
public interface BankTestOperation {
	void execute() throws InvalidAmountException, InsufficientFundsException;
}
