package com.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTest {
	int expRes, res, a , b, n;
	int[] inputArr = {5,4,7,2,7,4,4,7,7,2};
	Scanner sc = new Scanner(System.in);
	static Calculator cal;
	static SubArrays arr;
	
	@BeforeAll
	void getObject() {
		cal = new Calculator();
		arr = new SubArrays();
	}
	
	@BeforeEach
	void setValues() {
		System.out.println("Enter a:");
		a = sc.nextInt(); 
		System.out.println("Enter b:");
		b = sc.nextInt();
		
		n = inputArr.length;
		
		System.out.println("Enter Expected Result:");
		expRes = sc.nextInt(); 
	}
	
	@Test
	void testDiv() {
		res = cal.div(a, b);
		assertEquals(expRes, res);
	}
	
	@Test
	public void testMul() {
		res = cal.mul(a, b);
		assertEquals(expRes, res);
	}
	
	@Test
	void testAdd() {
		res = cal.add(a, b);
		assertEquals(expRes, res);
	}
	
	@Test
	void testSub() {
		res = cal.sub(a, b);
		assertEquals(expRes, res);
	}
}
