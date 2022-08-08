package com.bosch.stack;

public class Swapping {
 public static void main(String[] args) {
	int q=10,r=20,temp=0;
	System.out.println("Q "+q+" R "+r);
	temp=q;
	q=r;
	r=temp;
	System.out.println("Q "+q+" R "+r);
	
	q=q+r; //10+20
	r=q-r; //30-20
	q=q-r;    //30-10
	
	System.out.println("Q "+q+" R "+r);
	q=q*r; //10*20
	r=q/r; //200/20 10
	q=q/r;    //200/10 20
	
	System.out.println("Q "+q+" R "+r);
	
}
}
