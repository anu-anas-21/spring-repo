package com.calculator;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int n = sc.nextInt();
		
		System.out.println(getFistandLast(str, n));
		sc.close();
	}
	
	public static String getFistandLast(String s, int k) {
		String smallerStr = s.substring(0, k);
		String largerStr = s.substring(0, k);
		
		for (int i=1; i <= s.length() - k; i++) {
			String subStr = s.substring(i, i + k);
			
			//smallest substring
			if (subStr.compareTo(smallerStr) < 0) {
				smallerStr = subStr;
			}
			
			//Largest substring
			if (subStr.compareTo(largerStr) > 0) {
				largerStr = subStr;
			}
		}
		return smallerStr + "\n" + largerStr;
	}
}
