package package2;

public class Class2 {
	double x,y;
	
	
	double sum(double x,double y)
	{
		this.x=x;
		this.y=y;
		
		return x+y;
	}

	double multiplications(double x,double y)
	{
		return x*y;
	}
	
	double div(double x,double y)
	{
		return x/y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 C2=new Class2();
		
		
		
		double tot=C2.sum(10,30);
			
		System.out.println("Sum="+tot);
		
		double mul=C2.multiplications(10.0, 5.0);
		System.out.println("Multiplication="+mul);
		
		double div=C2.div(10.2, 1.0);
		System.out.println("Division="+div);
		
		

	}

}
