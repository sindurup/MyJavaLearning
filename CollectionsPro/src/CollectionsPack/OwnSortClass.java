package CollectionsPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OwnSortClass 
{

	public static void main(String[] args) 
	{
		List<Integer>values=new ArrayList<Integer>();
		
		
		values.add(709);
		values.add(892);
		values.add(987);
		values.add(124);
		
		//if we want to sort depends on 0's place
		//Comparator is a existing interface and compare is method in that
		
		
		//using ananymous class
		
		/*Comparator<Integer> c =new Comparator<Integer>()
				{
				     public int compare(Integer i,Integer j)
				     { 
				    	return i%10>j%10?1:-1;
				     }
				    	 
				 };
				 */
		
		//using Lambda Expression
		
		Comparator<Integer> c=(i,j)->i%10>j%10?1:-1;
				 
		Collections.sort(values,c);  
		
		for(Integer val:values)
			System.out.println(val);
		
		

	}

}
