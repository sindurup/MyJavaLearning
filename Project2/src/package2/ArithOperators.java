package package2;

public class ArithOperators
{
	
   public static void main(String[] args)
	{
		
		int index=0;
		int[] array=new int[3];
		array[index++]=10;
		array[index++]=20;
		array[index++]=30;
		System.out.println("Index="+index);
		
		// TODO Auto-generated method stub
		
		//comparision operators demo returns true or false
		
		int age=25;
		System.out.println("age>21:"+(age>21));
		System.out.println("age<21:"+(age<21));
		System.out.println("age>=21:"+(age>=21));
		System.out.println("age<=21:"+(age<=21));
		System.out.println("age==21:"+(age==21));
		System.out.println("age!=21:"+(age!=21));
		
		
	//**************************************************************	
		String s1=new String("hello");
		String s2=new String("hello");
		
		if(s1.equals(s2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");	
		}
		
		System.out.println("*************");
		
		if(s1==s2)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");	
		}
			
		//loops demo
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("*************");
		
		for(int i=10;i>=0;i--)
		{
			System.out.println(i);
		}
		
		//while loop
		System.out.println("****while*********");	
		int j=0;
		while(j<=10)
		{
			System.out.println(j);
			j++;
		}
			
		
		
		System.out.println("________________________");
		int k=10;
		while(k>=1)
		{
			System.out.println(k);
			k--;
		}
		
		//do while
		System.out.println("________________________");
		int a=0;
		
		do {
			System.out.println(a);
			a++;
		}
			while(a<=10);
		
		System.out.println("________________________");
		
		int b=10;
		do {
			System.out.println(b);
			b--;
		}
		while(b>=0);
		
		// break statment demo
		
		System.out.println("________________________");
		
		
		int[] numbers= {5,10,15,20,25};
		
		for(int num:numbers)
		{
			if(num==20)
			{
				break;
			}
			
			System.out.println(num);
			//output  5 10 15
		}
		
		
		//Continue statment demo
		System.out.println("________________________");
		for(int num:numbers)
		{
			if(num==20)
			{
				continue;
			}
			
			System.out.println(num);
			//output  5 10 15
		}
		

		
		
		
		
		
	}

}


