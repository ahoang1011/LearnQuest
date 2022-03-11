package com.lq.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lq.first.Calculator;
import com.lq.first.ClassToTest;

public class MyFirstTest {

	@Test
	public void testA() {
		
		Calculator c = new Calculator();
		
		int r = c.sumA(2, 5);
		
		//write a fact
		assertEquals(r, 42);
	}
	
	@Test
	public void testB() {
		
		Calculator c = new Calculator();
		
		int r = c.sumB(2, 5);
		
		assertEquals(r, 3);
	}
	
	@Test
	public void testC() {
		
		ClassToTest ctt = new ClassToTest();
		
		boolean r = ctt.MethodToTest(4);
		
		assertEquals(r, true);
	}

}
