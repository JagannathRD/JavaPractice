package com.bosch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapsInDetail {

	public static void main(String[] args) {
		Map<String, Integer> m= new HashMap<String, Integer>();
		m.put("Jggu", 1);
		m.put("Jaggu", 2);
		m.put("Eggu", 4);
		m.put("Nuggu", 3);
		m.put("Raggu", 1);
		
		//m.forEach((k,v)->System.out.println(k+""+v));
		
		for(Map.Entry<String, Integer> e:m.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	m.keySet();
	m.values();
	}
}
