package com.bankaccount;


public class BankAccountTest{
	public static void main(String[] args){
	BankAccount one = new BankAccount();
	BankAccount two = new BankAccount();
	BankAccount three = new BankAccount();
	one.accountDeposit("savings",100.00);
	two.accountDeposit("checking",300.00);
	three.accountDeposit("savings", 1000.00);
	one.accountWithdrawal("savings",60.00);
	two.accountWithdrawal("checking",100.00);
	three.accountWithdrawal("savings", 800.50);
	one.totalBalance();
	two.totalBalance();
	three.totalBalance();
	}
}