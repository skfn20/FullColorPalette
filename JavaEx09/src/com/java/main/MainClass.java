package com.java.main;

import com.java.pay.*;

public class MainClass {

	public static void main(String[] args) {
		PayClass my_pay = new PayClass();
		
		my_pay.Save(100);
		my_pay.getInfo();
		
		PayClass my_pay2 = new PayClass();
		
		my_pay2.Save(200);
		my_pay2.getInfo();
		
		
	}
}
