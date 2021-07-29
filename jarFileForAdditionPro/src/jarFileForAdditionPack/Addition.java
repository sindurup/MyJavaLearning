package jarFileForAdditionPack;

import java.util.Scanner;

public class Addition 
{

	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int i=obj.nextInt();
		
		System.out.println("Enter second number:");
		int j=obj.nextInt();
		
		System.out.println("Sum="+(i+j));
		obj.next();
		obj.close();
		
		
		
	}

}
