package com.bosch.inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Laambda {
	
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		list.add(6);

		list.add(40);
		list.add(50);
		list.add(20);
		list.add(30);
		
		//List in=list.stream().map(l->l*l).filter(n->n>50).collect(Collectors.toList());
		IntSummaryStatistics m=list.stream().mapToInt(l->l*l).filter(n->n>50).summaryStatistics();
		System.out.println(m);
		
		Random random =new Random();
		//random.ints().limit(10).forEach(System.out::println);
		IntSummaryStatistics prl=list.parallelStream().mapToInt(num->num*2).summaryStatistics();
		System.out.println(prl.getAverage());
		
		List<String>  countries=Arrays.asList("India","Us","Japan","Russia");
		countries.parallelStream().forEach(System.out::print);
		//Integer or=	list.stream().m((i1,i2)->i1.compareTo(i2)).get();
		//System.out.println(or);
		
		List<String> name= new ArrayList<String>(Arrays.asList("jagg","dada"));
		
		name.forEach(System.out::println);
		//System.out.println(Laambda);
	}
	
	String returnNames() {
		return "Hello";
	}

}
