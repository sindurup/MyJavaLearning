package package2;

public class TerinaryDemo
{
	
	static int min(int x,int y)
	{
		int result=(x<y)?x:y;
		return result;
		
	}

	public static void main(String[] args)
	{
		int res=TerinaryDemo.min(3, 7);
		System.out.println(res);
		

	}

}
