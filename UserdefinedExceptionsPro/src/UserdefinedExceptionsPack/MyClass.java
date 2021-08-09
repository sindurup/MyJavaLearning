package UserdefinedExceptionsPack;

public class MyClass {

	public static void main(String[] args)
	{
		int i,j,k;
		i=10;
		j=11;
		try
		{
		  
		k=i/j;
		
		if(k==0)
		{
			throw new MyOwnException("Its not possible");
		}
	}
		
		catch (MyOwnException ex)
		{
		
			System.out.println("Error:"+ex.getMessage());
		}

	}

}
