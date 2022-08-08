package com.bosch.sorting;

public class Reverse {
private static Reverse reverse=null;

private Reverse() {
	// TODO Auto-generated constructor stub
}

public static Reverse getReverse() {
	
	if(reverse==null)
		 reverse= new Reverse();
	return reverse;
}
public static void main(String[] args) {
	Reverse r1=Reverse.getReverse();
	Reverse r2=Reverse.getReverse();
	Reverse r3=Reverse.getReverse();
	
	System.out.println(r1.hashCode()+" "+r2.hashCode()+" "+r3.hashCode());
	
}
	}
