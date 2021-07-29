package finalKeywordPack;

//final variable
class A
{
	final int DAY=10;  //we can not change the values
	final int NUM;
	public A()
	{
		NUM=18;
		
	}
}
//-----------------------------------
//final class we can not extend means no derived classes

final class AB
{
	
}

//class GH extends AB
//{
	
//}

//---------------------------

//final method
//we can not override method in derived class

class CD
{
	public final void show()
	{
		System.out.println("IN CD");
	}
}

class EF extends CD
{
	//public final void show()
	//{
		System.out.println("IN CD");
	//}
}


//-----------------------------------------------
public class FinalClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
