package LambdaPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Products
{
	int id;
	String name;
	
	//Constructor
	Products(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
}







public class MyClass
{

	public static void main(String[] args) 
	{
		List<Integer>data=Arrays.asList(65,78,90,32,21,45,24,17);
		
		Collections.sort(data);
		
		//Lambdaexp
		
		data.forEach(d->System.out.println(d));
		
		
		//------------------------------------------------------
		
		List<Products> p=new ArrayList<Products>();
		
		p.add(new Products(1,"TV"));
		p.add(new Products(2,"Mobile"));
		p.add(new Products(3,"Laptop"));
		
         p.forEach(pDetails->System.out.println(pDetails.name));
		
		
		
	}

}
