package com.bosch.sorting;

public class Fibonacci {

	int i=0,j=1,k=0; //0 1 1 2 3 5
	
	void fib(int n) {
		System.out.println(i);
		System.out.println(j);
		while(n>2) {
		k=i+j;
		i=j;
		j=k;
		System.out.println(k);
		n--;
		}
	}
	
	public static void main(String[] args) {
		Fibonacci fab= new Fibonacci();
		fab.fib(5);
	}
	
	
}
