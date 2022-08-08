package com.bosch.stack;

public class EquArrays {
public static void main(String[] args) {
	int[] r= {1,2,0,5};
	int[] q= {1,2,4,5};
	
	//boolean req=true;
	for(int i=0;i<r.length;i++) {
		for(int j=0;j<q.length;j++) {
			int p=r[i]+q[j];
			if(p>5) {
				int t=0;
				int[ ] temp=new int[t];
				
				temp[t++]=r[i];
				temp[t++]=q[j];
				for(int u=0;u<temp.length;u++) {
					
					System.out.println(temp[u]);
			}
			}
		}
	}
	
	}
}
