package com.demo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		display(age);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = findSum(a, b);
		
		System.out.println(sum);
		
		sc.close();
	}
	
	static void display(int age) {
		System.out.printf("Your age is %d.", age);
	}
	
	static int findSum(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
