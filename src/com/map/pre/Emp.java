package com.map.pre;

public class Emp {

	public static void main(String[] args) {
		int[] rr= {1,2,3};
		int re=3;
		int index1=0;
		int index2=0;
		for(int i=0;i<rr.length;i++) {
			for(int j=i+1;j<rr.length;j++) {
				if(rr[i]+rr[j]==re) {
					index1=i;
					index2=j;
					System.out.println(index1+" "+index2);
				}

			//System.out.println(index1+" "+index2+rr[i]);
			
			}
		}
		
	}
}

