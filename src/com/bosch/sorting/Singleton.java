package com.bosch.sorting;

import java.util.Iterator;

public class Singleton{
int i=1;

public Singleton(int i) {
	super();
	this.i = i;
}

public static void main(String[] args) {
	String name="Quest Global";
	char [] ch=name.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
		System.out.print(ch[i]);
	}
	

}
}