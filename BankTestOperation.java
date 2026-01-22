package com.bpi.training.M4Activity6;

@FunctionalInterface
public interface BankTestOperation {
	void execute() throws InvalidAmountExceptions, InsufficientFundsExceptions;
}
