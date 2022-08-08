package com.bosch;

public class RevRecur {
	public static void main(String[] args) {
		
		String rev="",nme="Jagannath";
		for(int i=nme.length()-1;i>=0;i--) {
			rev=rev+nme.charAt(i);
		}
		System.out.println(nme.substring(1)+nme.charAt(0));
		rev=RevRecur.rev(nme);
		System.out.println(rev);
	}
		static String rev(String name) {
			if(name.isEmpty())
				return name;
			return rev(name.substring(1))+name.charAt(0);
		}
		
		

	

}
