
public class Test {
	public Test() {
System.out.println("constructor of test"+this.getClass().getSimpleName());
	}
	{
		System.out.println("this is from static block test"+this.getClass().getSimpleName());
	}
	
	void m2() {
		System.out.println("this is m2 test"+this.getClass().getSimpleName());
	}

	}
