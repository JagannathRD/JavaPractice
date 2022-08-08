package com.bosch.dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapEx {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 45, 3, 56, 6, 56 };
		List<Integer> num = (Arrays.asList(1, 3, 4, 5, 7));
		List<String> alpha = Arrays.asList( "A", "B", "C" );
		List<String> beta = Arrays.asList( "D", "E", "F" );
		List<String> gama = Arrays.asList( "G", "H", "I" );
		List<List<String>> listOfList = new ArrayList<List<String>>();
		listOfList.add(alpha);
		listOfList.add(beta);
		listOfList.add(gama);
		
		listOfList.stream().flatMap(m->m.stream()).forEach(System.out::print);
		

		OptionalDouble list = num.stream().map(i -> i * i).filter(j -> j > 5).mapToInt(i -> i).average();
		int sum = num.stream().mapToInt(i -> i).sum();
		System.out.println(list + " " + sum);

		List<String> names = Arrays.asList("Jaggu", "Raju", "Seenu");
		// String red=names.stream().reduce(null, null);
		IntSummaryStatistics max = num.stream().mapToInt(i -> i).summaryStatistics();
		System.out.println(max);
		
		List<String> city=Arrays.asList("NN","JJ","KK","oo","oo","KK","KK");
		int m=Collections.frequency(city, "KK");
		System.out.println(m);
		
		Set<String> s=city.stream().collect(Collectors.toSet());
		System.out.println(s+"This is from set");
		

	}
}
