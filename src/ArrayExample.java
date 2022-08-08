import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayExample {

	public static void main(String[] args) {
		int a[]={45,66,99,77,33,22,55};
		int max=a[0];
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]>max)
				max=a[i]
			System.out.println(a[i]);
			
		}
	}
	class A 
	{
	    final public int GetResult(int a, int b) { return 0; } 
	} 
	class B extends A 
	{ 
	    public int GetResult(int a, int b) {return 1; } 
	} 
	public class Test 
	{
	    public static void main(String args[]) 
	    { 
	        B b = new B(); 
	        System.out.println("x = " + b.GetResult(0, 1));  
	    } 
	}
}
