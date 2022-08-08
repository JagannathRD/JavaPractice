package com.bosch.sorting;

public class ReverseNum {
int n=123;
int rev=0,mo=0;
 int getRev(int num) {
	 while(num>0) {
	 mo=num%10; //3 2
	 rev=rev*10+mo; //3 32
	 mo=num/10; //12
	 }
	 return rev;
 }
 
 public static void main(String[] args) {
	ReverseNum reverseNum= new ReverseNum();
	System.out.println(reverseNum.getRev(123));
	int num=123;
	int rev=0,mo=0;
	while(num>0) {
		 mo=num%10; //3 2
		 rev=rev*10+mo; //3 32
		 num=num/10; //12
		 }
	System.out.println(rev+"hj");
}
}
