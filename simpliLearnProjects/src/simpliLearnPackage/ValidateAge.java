package simpliLearnPackage;

import java.util.Scanner;

public class ValidateAge
{

	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		
		int age;
		char c='i';
		do {
			
			System.out.println("Enter age:");
			age=obj.nextInt();
			if(age<0 || age>100)
			{
				c='i';
				System.out.println("Enter correct age");
				//obj.next();
				
			}
			else
			{
				c='v';
			System.out.println("age="+age);
			}
			//obj.next();
			
			
			
		}while(c!='v');
		obj.close();
		
		
		

	}

}
