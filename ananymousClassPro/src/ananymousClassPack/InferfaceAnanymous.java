package ananymousClassPack;

interface Abc
{
	public  void show();
}


/*
 *  class AC implements Abc
{
	public  void show()
	{
		System.out.println("Hello..............");
	}
}
*/

public class InferfaceAnanymous
{

	public static void main(String[] args)
	{
		//AC obj=new AC();
		//obj.show();
		
		Abc obj=new Abc()
				{
					public void show()
					{
						System.out.println("Hello..............");
					}
				};
				obj.show();
		

	}

}
