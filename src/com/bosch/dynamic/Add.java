package com.bosch.dynamic;

import java.util.Scanner;

public class Add {
	
	public int add(int x,int y) {
		
		return x+y;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter x & y values");
		int x= sc.nextInt();
		int y=sc.nextInt();
		
		
		Add ad= new Add();
		System.out.println(ad.add(x, y));
		sc.close();
	}

}
