package com.boch.chcount;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
public static void main(String[] args) {
	String nme="Jagannathj";
	String name=nme.toLowerCase();
	Map<Character, Integer> m= new HashMap<Character, Integer>();
	
	for(int i=0; i<name.length();i++) {
	if(m.containsKey(nme.charAt(i)))
	{
		int getV=m.get(name.charAt(i));
		m.put(name.charAt(i), ++getV);
	}
	else {
		m.put(name.charAt(i), 1);
	}
	}
	System.out.println(m);
}
}
