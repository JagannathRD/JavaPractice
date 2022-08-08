package com.bosch.stack;

public class Stack {
	int [] row= new int[5];
	int top=0;
	
	void push(int num) {
		row[top]=num;
		top++;
	}
	int peek() {
		//top++;
		return row[top-1];
	}

	int pop() {
		int tr;
		top--;
		tr=row[top];
		row[top]=0;
		return tr;
	}
	
		void getRow() {
		
		 for(int n:row) {
			 System.out.println(n);
		 }
	}
}
