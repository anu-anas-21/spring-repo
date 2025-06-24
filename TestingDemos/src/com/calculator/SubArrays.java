package com.calculator;

import java.util.*;

public class SubArrays {

	public int smallestLength(int arr[], int n) {
		int length = arr.length;
		
		for (int size = 1; size <= length; size++) {
			boolean possible = true;
			
			for (int i=0; i<length;) {
				boolean matched = false;
				
				for (int j = 0; j < size && i + j < n; j++) {
					boolean match = true;
					
					for (int k = 0; k <= j && i + k < n; k++) {
						if (arr[k] != arr[i + k]) {
							match = false;
							break;
						}
					}
					if (match) {
						i += j +1;
						matched = true;
						break;
					}
				}
				if (!matched) {
					possible = false;
					break;
				}
			}
			if (possible) {
				return size;
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		int[] b = {5,4,7,2,7,4,4,7,7,2};
		int[] a = {1,1,1,1};
		int n = 10;
		
		int res = new SubArrays().smallestLength(b, n);
		System.out.println(res);
	}
}
