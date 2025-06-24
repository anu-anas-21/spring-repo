package com.calculator;

import java.util.Scanner;

@SuppressWarnings("serial")
class AgeRestriction extends Exception {
	public AgeRestriction(String message) {
		super(message);
	}
}

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();
			validateAge(n);
		} catch (AgeRestriction e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Problem Resolved.");
		}
		sc.close();
	}
	
	public static void validateAge(int age) throws AgeRestriction {
		if (age < 18) {
			throw new AgeRestriction("Age must be 18 or above.");
		}
	}

}
