package com.bosch.sorting;

public class Prime {
	public static void main(String[] args) {
		int n=123;
		int no = 0;
		for (int i = 2; i < n/2; i++) {
			if (n%i==0) {
				no=1;
				System.out.println(i);
			break;}
		}
			if (no==1) 
				System.out.println("not prime");
			
			else 
				System.out.println("  prime");
				
				}
	
	
}
