package interfacePack;


interface Demo
{
	void show();
	
	default void print()
	{
		System.out.println("In print");
	}
}

class DemoImp implements Demo
{
	public void show()
	{
		System.out.println("In show");
	}
	
	public void print()
	{
		System.out.println("In new print");
	}
}
public class DefaultMethodInInterfaceClass {

	public static void main(String[] args)

	{
		Demo obj=new DemoImp();
		obj.show();
		obj.print();
	}

}
