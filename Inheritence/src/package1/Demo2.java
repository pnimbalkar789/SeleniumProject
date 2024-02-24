package package1;

public class Demo2 extends Demo1 {

	Demo2()
	{
		
		System.out.println("Demo2 blank constructor");
	}
	
	Demo2(int a)
	{
		
		System.out.println("Demo2 int constructor");
	}
	
	                    
	Demo2(String name)
	{
		super();
		System.out.println("Demo2 string constructor");
	}		
	
	
	
}
