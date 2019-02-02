package com.java.pay;

public class PayClass {

	static int pay = 0;
	
	public PayClass() {
		System.out.println("--construct PayClass--");
	}
	
	public void Save(int money) {
		pay += money;
	}
	
	public void getInfo() {
		System.out.println("pay : " + pay);
	}
	
	
}
