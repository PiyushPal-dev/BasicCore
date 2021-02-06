package com.thread;

public class Account {
private int balance =0;
public void deposit(String name, int amount) {
	synchronized(this) {
	int bal = getBalance() + amount;
	setBalance(bal);
	}
	System.out.println(name+ "New Balance"+balance);
}
private void setBalance(int balance) {
	// TODO Auto-generated method stub
	this.balance = balance;
}
private int getBalance() {
	// TODO Auto-generated method stub
	return balance;
}
}
