package CollectionsPack;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass
{

	public static void main(String[] args)
	{
		Set<Integer>values=new HashSet<Integer>();
		values.add(100);
		values.add(890);
		values.add(765);
		values.add(697);
		values.add(100);
		values.add(763);
		
		//Set doesnot print duplicate values, and  hashset doesnot print in order
		
		for(Integer num:values)
		{
			System.out.println(num);
		}

		
	}

}
