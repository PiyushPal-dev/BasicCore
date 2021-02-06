package com.thread;

public class RacingcondThread extends Thread {
	public static Account data= new Account();
	
	public RacingcondThread(String name) {
		super(name);
	}
	public void run() {
		for(int i = 0; i<5; i++) {
			data.deposit(getName(), 1000);
		}
	}
public static void main(String[] args) {
	RacingcondThread f= new RacingcondThread("Carlo");
	RacingcondThread l= new RacingcondThread("Sara");
	f.start();
	l.start();
	
}
}
