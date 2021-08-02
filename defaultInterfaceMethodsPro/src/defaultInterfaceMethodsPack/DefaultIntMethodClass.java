package defaultInterfaceMethodsPack;

	//in functional interface only one abstract method is there and we can use any number of default methods
		interface Calc 
		{
			void print();
			default void show()
			{
				System.out.println("in Calc show");
				
			}
				
			default void Hello()
			{
				System.out.println("Hello World!");
			}
			
			
			
		}

		interface Calc2
		{
			default void show()
			{
				System.out.println("in Calc 1 show");
				
			}
		}


class ABC implements Calc,Calc2{
	
	public void print()
	{
		System.out.println("Print");
	}
		
			@Override
			public void show()
			{
				Calc.super.show();
			}

		}




public class DefaultIntMethodClass
{

		public static void main(String[] args)
		{
			ABC obj=new ABC();
			obj.print();
			obj.show();
			
		}

	
}
