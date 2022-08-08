package com.boch.chcount;

import java.util.HashMap;
import java.util.Map;

public class Count {
public static void main(String[] args) {
	String name="Sudarshan";
	Map<Character, Integer> m= new HashMap<Character, Integer>();
	for(int i=0; i<name.length();i++) {
		if(m.containsKey(name.toLowerCase().charAt(i))){
			int charV=m.get(name.toLowerCase().charAt(i));
			m.put(name.toLowerCase().charAt(i), ++charV);
		}
		else {
			m.put(name.toLowerCase().charAt(i), 1);
		}
	}
	System.out.println(m);
}
}
