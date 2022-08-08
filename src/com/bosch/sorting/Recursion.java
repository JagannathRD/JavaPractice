package com.bosch.sorting;

public class Recursion {

	
	public static int factor(int k) {
		if (k>1)
		return k*factor(k-1);
		else
			return 1;
	}
	
	public static void main(String[] args) {
		int res=factor(5);
		System.out.println(res);
	}
}
