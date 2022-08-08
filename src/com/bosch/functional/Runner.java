package com.bosch.functional;

public class Runner {

	public static void main(String[] args) {
		Adder adder=(a,b,c)->{
				
			System.out.println((a+b+c));
			
			return 0;
		
		};
		adder.add(2, 8, 12);
	}
}
