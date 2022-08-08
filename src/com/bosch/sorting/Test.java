package com.bosch.sorting;

public class Test {
public static void main(String[] args) {
	System.out.println("Hello");
	Test test =new Test();
	System.out.println(test.getReeverse(126763));
}
int rev=0,mo=0;
	int getReeverse(int n) {
		
		
		
		while(n>0) {
			mo=n%10;
			rev=rev*10+mo;
			n=n/10;
		}
		return rev;

	
	}
}
