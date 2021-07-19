package listDemo;
import java.util.ArrayList;
import java.util.Iterator;

public class arrayListDemo {

	public static void main(String[] args)
	{
		int sum=0;
		ArrayList<Integer> data=new ArrayList<Integer>();
		data.add(100);
		data.add(200);
		data.add(300);
		
		//display data
		//--------------------------------
		Iterator itr=data.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//-------------------------
		
		
		
		
		for (int d:data)
			sum+=d;
		System.out.println("Total:"+sum);
	
		
			
	}

}
