package model.entities;

import model.exception.withdrawException;

public class Account {

	public int number;
	public String holder;
	public double Balance;
	public double WithdrawLimit;
	
	public Account() {
	}
	
	public Account(int number, String holder, double initialBalance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.Balance = initialBalance;
		WithdrawLimit = withdrawLimit;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double initialBalance) {
		this.Balance = initialBalance;
	}
	public double getWithdrawLimit() {
		return WithdrawLimit;
	}
	public void setWithdrawLimit(double withdrawLimit) {
		WithdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		Balance += amount;
	}
	public void withdraw(double amount) {
		if(Balance < amount) {
			throw new withdrawException("Not enough balance");
		}
		if(WithdrawLimit < amount) {
			throw new withdrawException("The amount exceeds withdraw limit");
		}
		Balance -= amount;
	}

	
	
	
}
