
public class Child extends Test {
	public Child() {
System.out.println("this is from child "+this.getClass().getSimpleName());
	}

	{
		System.out.println("this is from static block "+this.getClass().getSimpleName());
	}
	
	void m2() {
		System.out.println("this is m1 "+this.getClass().getSimpleName());
	}
	
	public static void main(String[] args) {
		
		String name="ABA";
				String rev="";

				for(int i=name.length()-1;i>=0;i--){
					rev=rev+name.charAt(i);
				
				}
				if(name.equals(rev))
					System.out.println("Pal");
				else
					System.out.println("Not pal");

				Test test= new Child();
				test.m2();
	}
	
	
}
