package simpliLearnPackage;

import java.util.Scanner;

public class CreatingjarFile 
{

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number");
		int num=obj.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
			
		}
		obj.next();
		//obj.close();

	}

}
