package interfaceStaticMethodsPack;
interface Demo
{
	//if we declare a variable in interface it is final
	int num=8;
	
	void show();
	
	//we can declare static methods in interface
	
	static void print()
	{
		System.out.println("HEllo");
	}
}

class ABC implements Demo
{
	
	public void show()
	{
	//	num=10;
		System.out.println("Hi............");
	}
	

}



public class MyClass 
{

	public static void main(String[] args) 
	{
	
		Demo.print();//calling static method in interface
		
		Demo obj=new ABC();
		obj.show();
	}

}
