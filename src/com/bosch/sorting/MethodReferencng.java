package com.bosch.sorting;

public class MethodReferencng {
	public  void callMe(int x, int y) {
		System.out.println("Calling you"+x*y);
	}
	public MethodReferencng() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	public static void main(String[] args) {
		CallMe call=(x,y)->System.out.println(x*y);
		call.callMyName(3,5);
		MethodReferencng methodReferencng= new MethodReferencng();
		CallMe methoDRef=methodReferencng::callMe;
		methoDRef.callMyName(2,6);
		
		
		
	
	}
		}
