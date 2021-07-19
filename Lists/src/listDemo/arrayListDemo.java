package listDemo;
import java.util.ArrayList;

public class arrayListDemo {

	public static void main(String[] args)
	{
		int sum=0;
		ArrayList<Integer> data=new ArrayList<Integer>();
		data.add(100);
		data.add(200);
		data.add(300);
		
		for (int d:data)
			sum+=d;
		System.out.println("Total:"+sum);
			
	}

}
