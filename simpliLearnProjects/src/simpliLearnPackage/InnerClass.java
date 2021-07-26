package simpliLearnPackage;

//Inner class Demo using normal class
/*
public class InnerClass 
{
	public float pi=(float)22/7;
	
	class Algebra
	{
		public int add(int a,int b)
		{
			return a+b;
			
		}
		
	
	}
	
	class Geometry
	{
		public float circleArea(int r)
		{
			return pi*r*r;
		}
	}
	
	

	

}*/

//Inner class demo using static class

public class InnerClass 
{
	public static float pi=(float)22/7;
	
	static class Algebra
	{
		public static int add(int a,int b)
		{
			return a+b;
			
		}
		
	
	}
	
	static class Geometry
	{
		public static float circleArea(int r)
		{
			return pi*r*r;
		}
	}
	
	

	

}

