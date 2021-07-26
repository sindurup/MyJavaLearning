package simpliLearnPackage;

public class MyClass 
{

	public static void main(String[] args)
	{
		//normal class object declaration
/*
 *  	InnerClass obj=new InnerClass();
		
		InnerClass.Algebra ab=obj.new Algebra();
		
		InnerClass.Geometry Ge=obj.new Geometry();
		System.out.println("total:"+ab.add(5, 9));

		
		System.out.println("Area:"+	Ge.circleArea(4));
 
	
*/
		//Static class declaration
		
        System.out.println("total:"+InnerClass.Algebra.add(5, 9));

		
		System.out.println("Area:"+InnerClass.Geometry.circleArea(4));	
		

	}

}
