package com.java.main;

public class StudentClass {

	private String name;
	private int score;
	
	public StudentClass(String n, int s) {
		this.name = n;
		this.score = s;
	}
	
	public void getInfo() {
		System.out.println("--getInfo()--");
		System.out.println("name : " + name);
		System.out.println("score : " + score);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
