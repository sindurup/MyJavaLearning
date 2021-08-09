package CollectionsPack;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass
{

	public static void main(String[] args)
	{
		Set<Integer> values=new TreeSet<Integer>();
		
		values.add(100);
		values.add(890);
		values.add(765);
		values.add(697);
		values.add(100);
		values.add(763);
		
		//TreeSet prints values in ascending order
		for(var v:values)
		{
			System.out.println(v);
		}
		
	}

}
