package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account() {
    	
    }
    
    public Account(String accountNo, int balance) {
    	super();
    	this.accountNo = accountNo;
    	this.balance = balance;
    }

	public Account(String accountNo) {
		super();
		this.accountNo = accountNo;
	}
    //필요한 메소드 작성
	
	public void deposit(int money) {
		balance = balance + money;
	}
	public void withdraw(int money) {
		balance = balance-money;
	}
	public void showBalance() {
		System.out.println(balance);
	}
	

}
