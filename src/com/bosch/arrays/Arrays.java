package com.bosch.arrays;

public class Arrays {
 int [] a= {1,2,3,4,1,2};
 int [] b= {4,2,3,5};
 int[] getSum() {
	int temp[] = new int[0];
	 int sum[]=new int[a.length];
	 int count=0;
 for (int i=0;i<a.length;i++) {
	 
	 sum[i]=a[i]+b[i];
	 if(sum[i]>5) {
		 int j=0;
		temp[j]=sum[i];
				}
	 
 }
 return temp;
 }
 
 public static void main(String[] args) {
	Arrays arrays= new Arrays();
	
	for (int i=0;i<arrays.getSum().length;i++) {
		 
		System.out.println(arrays.getSum()[i]);
	 }


}
}
