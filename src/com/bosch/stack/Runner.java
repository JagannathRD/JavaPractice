package com.bosch.stack;

public class Runner  {

	public static void main(String[] args) {
		Stack stack= new Stack(); 
		stack.push(5);
		stack.push(3);
		stack.push(4);
		stack.push(1);
		
		stack.getRow();
		System.out.println("Peek "+stack.peek());
		System.out.println("POP "+stack.pop());
		stack.getRow();
		
		
		Adder adder=(a,b,c)->(a+b+c);
		//adder.add(1, 2, 3)
		System.out.println(adder.add(1, 2, 3));
			}

	
	
	}
