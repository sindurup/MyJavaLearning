package package2;


public class MathDemo
{
	
	private static void mathDemo()
	{
		//random
	double random=Math.random();
	
	int winner=(int)(random*100)+1;
	System.out.println(random);
	System.out.println("Winner="+winner);
	
	//***********************************
	
	//double
	long d1=Math.round(24.349);
	int d2=Math.round(24.5f);
	System.out.println(d1);
	System.out.println(d2);
	
	//ceil
	
	double ceil1=Math.ceil(24.349);
	double ceil2=Math.ceil(24.0);
	System.out.println(ceil1);
	System.out.println(ceil2);
	
	//floor
	double f1=Math.floor(24.349);
	double f2=Math.floor(24.0);
	System.out.println(f1);
	System.out.println(f2);
	
	//max
	
	double max=Math.max(24.76, 24.32);
	System.out.println(max);
	
	
	//abs
	
	double abs=Math.abs(-24.76);
	System.out.println(abs);
	
	
	//power
	double pow=Math.pow(2, 4);
	System.out.println(pow);
	
	//sqrt
	
	System.out.println(Math.sqrt(-4));
	System.out.println(Math.sqrt(3));
	
	
	
	
	
	
	
	}

	public static void main(String[] args) 
	{
		MathDemo.mathDemo();
		
		
	}

}
