

package linearSearchPack;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Linear search searches data element by element
 * 
 */

public class LinearSearchClass 
{

	public static void main(String[] args) 
	{
	List<Integer>data=Arrays.asList(78,90,64,32,97,54,21,24,17);
	int searchElement,loc=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("Please enter search element");
	searchElement=obj.nextInt();
	
	//both for loops we can use
	
	//for(int i=0;i<data.size();i++)
	for(int d:data)
		
	{
		//if(searchElement==data.get(d))
		if(searchElement==d)
		{
			System.out.println("Element found at:"+loc);
			break;
			
		}
		loc++;
	}
	if(loc==data.size())
	{
		System.out.println("Not found");
	}
		
		

	}

}
