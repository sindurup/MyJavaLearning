package ananymousClassPack;

//when the purpose is to create override class then instead of overriding method in derived class we use ananymous class


class A
{
	public void show() {
		System.out.println("IN A");
	}
}

/*
class B extends A
{
	public void show()
	{
		System.out.println("Hello.............");
	}
}

*/

public class AnanymousClass {

	public static void main(String[] args) 
	{
		
		//A obj=new B();
		//obj.show();
		
		A obj=new A() 
		{
			
			public void show()
			{
				System.out.println("Hello.............");
			}
			
		
		
		};
		obj.show();
		
				
	}

}
