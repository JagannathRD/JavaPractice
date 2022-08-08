package com.bosch.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Student implements Comparable<Student> {
	Integer age;
	int standard;
	String name;
	String college;
	String university;
	
public Student(int age, int standard, String name, String college, String university) {
		super();
		this.age = age;
		this.standard = standard;
		this.name = name;
		this.college = college;
		this.university = university;
	}
public Student() {
	// TODO Auto-generated constructor stub
	System.out.println("Created");
}
@Override
public String toString() {
	return "Student [age=" + age + ", standard=" + standard + ", name=" + name + ", college=" + college
			+ ", university=" + university + "]";
}
public static void main(String[] args) {
	List<Student> pu= new ArrayList<Student>();
	pu.add(new Student(22, 12, "Arun", "Dj", "PU"));
	pu.add(new Student(25, 12, "Cru", "J", "PU"));
	pu.add(new Student(22, 12, "Nun", "Pdj", "PU"));
	pu.add(new Student(31, 12, "Bro", "Abc", "PU"));
	
	Student s= new Student();
	
	List<String> numbers= Arrays.asList("Jaggu","Janu","Sonu");
	Predicate<Student> p1=i->i.age>22;
	Predicate<Student> p2=i->i.college.equalsIgnoreCase("j");
	Comparator<Student> c= (i,j)->i.age.compareTo(j.age);
	pu.stream().sorted(c);
	//long c=pu.stream().filter(p1.and(p2)).count();
	System.out.println("Count = "+c);
//	Iterator<Student> itr=pu.iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
//	
//	pu.forEach(i->System.out.println(i));
	
	for(String n:numbers) {
		System.out.println(n.toCharArray());
	}
	Integer[] m= {7,9,3,4,0};
	List l=Arrays.stream(m).collect(Collectors.toList());
	
	//System.out.println(numbers.toArray());
	System.out.println(l);
	//Collections.sort(l);
	System.out.println(l);
	//Collections.sort(pu);
	System.out.println(pu);
	Comparator<Student> comp=((s1,s2)->s1.college.compareTo(s2.college));
	List<Student> ls= pu.stream().sorted().collect(Collectors.toList());
	System.out.println(ls);
	
//	Map<Integer, String> u=pu.stream().filter(a->a.age>20).collect(Collectors.);
//	System.out.println(u);
}
@Override
public int compareTo(Student s) {
	// TODO Auto-generated method stub
	return (this.age==s.age)?0:(this.age<s.age)?-1:1;
}

}
