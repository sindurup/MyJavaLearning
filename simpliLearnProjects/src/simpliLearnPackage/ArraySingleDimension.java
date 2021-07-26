package simpliLearnPackage;

public class ArraySingleDimension
{

	public static void main(String[] args) 
	{
	   int[] data=new int[] {2,3,4,5,6,7};
	   for(int i=0;i<6;i++)
	   {
	    System.out.println(data[i]);
	   }
	   
	   System.out.println("*********************");
	   
	   
	   for(int i=0;i<data.length;i++)
	   {
	    System.out.println(data[i]);
	   }
	   
	   System.out.println("*********************");
	   
	   for(int d:data)
	  
	   System.out.println(d);
	   
	 //  System.out.print(d+" ");
	   
	   
	   System.out.println("*********************");
	   
	   for(var d1:data)
			  
		    System.out.println(d1);
		   
	   System.out.println("*********************");
	   
	   
	}
	
	
	

}
