package com.map.pre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Student {
		
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
	System.out.println(pu);
	Comparator<Student> c=(i,j)->j.age.compareTo(i.age);
	Collections.sort(pu,c);
	System.out.println(pu);
}

}