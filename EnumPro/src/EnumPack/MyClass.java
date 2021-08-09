package EnumPack;


//enum we can create inside the class or outside the class

enum Mobile
{
	APPLE,SAMSUNG,HTC;
	
	//we can declare variables and methods in enum
	
	int price;
	public int getPrice()
	{
		return price;
	}
	
}

public class MyClass
{

	public static void main(String[] args)
	{
		Mobile m=Mobile.APPLE;
		//Mobile obj=Mobile.
		
		switch(m)
		{
		case APPLE:
			System.out.println("APPLE");
			break;
		case SAMSUNG:
			System.out.println("SAMSUNG");
			break;
			
		}

	}

}
