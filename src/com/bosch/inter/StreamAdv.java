package com.bosch.inter;

import java.util.Arrays;
import java.util.List;


public class StreamAdv {

	public static void main(String[] args) {
		List<String> num= Arrays.asList("1","2","5","10");
		
		num.stream().map(i->Integer.parseInt(i)).filter(i->i>5).forEach(System.out::println);
	}
}
