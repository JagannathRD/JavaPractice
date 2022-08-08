package com.bosch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Palindrome {

public static void main(String[] args) {
	Scanner c= new Scanner(System.in);
	String rev="";
	System.out.println("Enter a string");
	String name=c.nextLine();
	System.out.println("Entered  string "+name);
	
	for(int i=name.length()-1;i>=0;i--) {
		rev=rev+name.charAt(i);
	}
	if(name.equals(rev))
		System.out.println("palindrome " +rev.split(""));
	else
		System.out.println("not "+rev);
	
	Map<Integer, Integer> map= new HashMap<Integer, Integer>();
 int [] a= {1,2,1,4,5,4,5,5};
 int v=0;
 for(int i=0;i<a.length;i++) {
	 if(map.containsKey(a[i])) {
		 v=map.get(a[i]);
		 map.put(a[i], ++v);
	 }
	 else
		 map.put(a[i], 1);
 }
	System.out.println(map);
} 

}
