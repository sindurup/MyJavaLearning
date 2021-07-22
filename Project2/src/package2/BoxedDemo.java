package package2;
import java.util.ArrayList;

public class BoxedDemo
{

	static void boxedPrimitives()
	{
		Integer boxInt=Integer.valueOf(8);
		Integer boxInt1=Integer.valueOf("8");
		Boolean boxBoo=Boolean.valueOf(true);
		Character boxChar=Character.valueOf('c');
		Double boxDouble=Double.valueOf(25.5);
		
		System.out.println("boxInt="+boxInt);
		System.out.println("boxInt1="+boxInt1);
		
		System.out.println("boxBoo="+boxBoo);
		System.out.println("boxChar="+boxChar);
		System.out.println("boxDouble="+boxDouble);
		
		
		//unwrap
		
		int primitiveInt=boxInt.intValue();
		boolean primitiveBoolean=boxBoo.booleanValue();
		char primitiveChar=boxChar.charValue();
		
		System.out.println("primitiveInt="+primitiveInt);
		System.out.println("primitiveBoolean="+primitiveBoolean);
		System.out.println("primitiveChar="+primitiveChar);
		
		//parsing strings
		
		String data="4004	Effective Java Programming Language Guide	2007	T	4.9";
		String[] items=data.split("\t");
		long id1=Long.parseLong(items[0]);
		String tit=items[0];
		int id=Integer.parseInt(items[2]);
		char genre=items[3].charAt(0);
		double rating=Double.parseDouble(items[4]);
		
		
		System.out.println("id"+id);
		System.out.println("tit="+tit);
		
		System.out.println("id1="+id1);
		
		System.out.println("genre="+genre);
		System.out.println(rating);
		
		// 3. utility method
	boolean isLetter = Character.isLetter(genre);
	boolean isDigit = Character.isDigit(genre);
	boolean isLetterOrDigit = Character.isLetterOrDigit(genre);
	boolean isUpperCase = Character.isUpperCase(genre);
			
			System.out.println(isLetter);
			System.out.println(isDigit);
			System.out.println(isLetterOrDigit);
			System.out.println(isUpperCase);
			
			boolean isNan = Double.isNaN(0.0/0.0);
			System.out.println(isNan);
			
			String binary = Integer.toBinaryString(8);
			System.out.println(binary);
			String pubYearAsString = Integer.toString(id);
			
			// Populate data structure
			ArrayList idList = new ArrayList();
			idList.add(Long.valueOf(id));
			idList.add(id); // Java 5 - auto-boxing
				
		
		
		
	}
	
	
	static void compareBoxPrimitives() {      
		  System.out.println("\nInside compareBoxPrimitives ...");
	      Integer num1 = new Integer(0);
		  Integer num2 = new Integer(0);
		  System.out.println("(num1 == num2): " + (num1 == num2));
		  
		  // Solutions:
		  System.out.println("(num1.intValue() == num2.intValue()): " + (num1.intValue() == num2.intValue()));
		  System.out.println("(num1.equals(num2)): " + (num1.equals(num2)));
		  	  
		  Integer num3 = new Integer(1);
		  System.out.println("(num1 < num3): " + (num1 < num3)); // "<" does un-boxing first
	    }
		
		static Integer i;
		static void unbelievable() {
		  System.out.println("\nInside unbelievable ...");
	      if (i == 0)
	         System.out.println("weird!");
	    }
	public static void main(String[] args)
	{
		boxedPrimitives();
		compareBoxPrimitives();
		unbelievable();
		

	}

}
