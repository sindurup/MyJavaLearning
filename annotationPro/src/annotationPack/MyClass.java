package annotationPack;

class A
{
	public void show()
	{
		System.out.println("in A");
	}
}

class B extends A
{
	@Override   //this is called annotation
	public void show()
	{
		System.out.println("in B");
	}
	
	@Deprecated
	public void print() {
		
	}
}

@FunctionalInterface
interface Ishow
{
	void show();
//	void print();
	
}
public class MyClass
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
