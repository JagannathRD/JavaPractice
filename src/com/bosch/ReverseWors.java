package com.bosch;

public class ReverseWors {
 public static void main(String[] args) {
	String word="God is great";
	 String[ ] temp=word.split(" ");
	 String result="";
	 int count = 0;
	 for(int i = 0; i < word.length(); i++) {
		 count++;
	 }
	 for (int i = 0; i < temp.length; i++) {
		 
        if (i == temp.length - 1) {
             result = temp[i] + result;
        System.out.println(result );}
        else {
             result = " " + temp[i] + result; // ""+go +""
        System.out.println(result);}
}
	 System.out.println(result +" "+count);
 }}
	