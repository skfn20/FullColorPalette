package com.java.main;

public class MainClass {

	public static void main(String[] args) {
		
		StudentClass student1 = new StudentClass("Jack", 100);
		
		student1.getInfo();
		
		student1.setScore(250);
		
		student1.getInfo();
		
	}
}
