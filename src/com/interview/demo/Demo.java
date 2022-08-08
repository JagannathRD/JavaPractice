package com.interview.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Demo {
          public static void main(String[] args) {
			//select count(user) from Emp where country='us'
        	  
        	  List<Integer> num= new ArrayList<Integer>(Arrays.asList(1,8,3,5,0,8,1,3));
        	  
        	  Comparator<Integer> ic=(i,j)->i.compareTo(j);
        	  //Collections.sort(num);
        	  num.sort(ic);
        	 // System.out.println(num);
        	  
        	  int[] l1= {1,8,3,5,0,8,1,3};
        	  HashSet<Integer> hashSet= new HashSet<Integer>(num);
        	  System.out.println(hashSet);
        	  for(int i=0;i<l1.length;i++) {
        		  if(!hashSet.contains(l1[i]))
        	  System.out.println();
        			  
		}}
	}
