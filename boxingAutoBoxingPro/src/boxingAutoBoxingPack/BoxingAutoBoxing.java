package boxingAutoBoxingPack;

public class BoxingAutoBoxing 
{

	public static void main(String[] args) 
	{
		int i=5; //primitive data type
		
		Integer ii=new Integer(i); //boxing -- wrapping
		
		int j=ii.intValue(); // unboxing --unwrapping
		
		Integer k=i; //autoboxing
		
		int n=k; //autounboxing
	//-----------------------------------------------------
		
		String str="123";
		int s=Integer.parseInt(str);
		System.out.println(s); //out put is 123
		
		
		
	}

}
