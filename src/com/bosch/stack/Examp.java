package com.bosch.stack;

public class Examp {
	int []a;
	public Examp(int n) {
		a= new int[n];
		
	}
	
	int i=0;
	
	void put(int n) {
		a[i]=n;
		i++;
			}
	
	int peek() {
		return a[i-1];
	}
	
	int pop() {
		
		int top=a[--i];
		a[i]=0;
		return top;
		
	}
	
	void getRow() {
		for(int n:a) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		Examp examp= new Examp(6);
		examp.put(1);
		examp.put(6);
		examp.put(8);
		examp.getRow();
		System.out.println(examp.peek()+" peeko");
		System.out.println(examp.pop()+" pop");
	
		examp.getRow();
		
	}
	}
