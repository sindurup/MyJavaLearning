package lambdaExpPack;

public class LambdaExpClass {

	interface Write
	{
		void print();
	}
@FunctionalInterface

//in functional interface only one abstract method is there and we can use any number of default methods
	interface Calc 
	{
		void sum(); //abstract method
		
		 //default methods
		default void show()
		{
			System.out.println("in Calc show");
			
		}
			
		default void Hello()
		{
			System.out.println("Hello World!");
		}
		
	}




	public static void main(String[] args) {

		Write obj = () -> System.out.println("Hello"); //lamba expression
		obj.print();

		Calc obj1 = () -> {
			                 int a=5;
			                 int b=6;
			                 int sum=a+b;
			                 System.out.println("sum="+sum);

		                  };
		                  obj1.sum();
		                  
		                 // obj1.show();
	
	}

}
