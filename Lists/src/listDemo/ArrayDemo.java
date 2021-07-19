package listDemo;

public class ArrayDemo 
{
	public int[] data=new int[]{34,53,87,3,98};
	
	public void readArray()
	{
		//lower type of printing array
		//-------------------------------------
		
		for(int i=0;i<data.length;i++)
			
			System.out.println(data[i]);
		//-----------------------------------------
		
		
		//if datatype is constant forever use this
		//------------------------------------
		for(int d:data)
			System.out.println(d);	
		//-----------------------------------------
		
		
		//if datatype is not constant forever use this .Var takes all datatypes
				//------------------------------------
				for(var d:data)
					System.out.println(d);	
				//-----------------------------------------
				
		
		
		
	}
	
	
	
	
	
	
	

}
