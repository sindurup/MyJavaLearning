package CollectionsPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo
{

	public static void main(String[] args) 
	{
		//if we didint mention datatype here it will accept all data types
		//if we need mention specific datatype mention in<> called generics
		//List values=new ArrayList();
		List<Integer> values=new ArrayList<>();
		values.add(9);
		values.add(7);
		values.add(11);
		values.add(89);
		//values.add("abc");
		//if we want add one more value after 7 give index,value
		values.add(2,100);
		
		//sorting
		//reverse options reverse the values
		Collections.reverse(values);  //output 100 89 11 7 9
		
		//ascending order
		Collections.sort(values);  //output 7 9 11 89 100
		
		//if we need descending format then first sort the values afterthat perform reverse
		
		Collections.reverse(values); //output //100 89 11 9 7
	
		
		
		//using iterator
		
		Iterator it=values.iterator();
		
		//has next checkes the after element
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//using for
		for(Object o:values)
			System.out.println(o);
		
		
		
	}

}
