package com.lq.first;

public class Calculator {
	
	//static means created only once but everyone can use it and My_NUMBER is constant
	private static final int MY_NUMBER = 6;
	
	public int sumA(int a, int b) {
		return (a + b) * MY_NUMBER;
	}
	
	public int sumB(int a, int b) {
		return (a - b) + MY_NUMBER;
	}

}
