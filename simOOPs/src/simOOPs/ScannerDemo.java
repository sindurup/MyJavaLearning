package simOOPs;
import java.util.Scanner;
// scanner for taking input data
public class ScannerDemo
{
	String name;
	int age;
	float sal;
	
	public void getDetails()
	{
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter name:");
		name=obj.nextLine();
		
		System.out.println("Enter age:");
		age=obj.nextInt();
		
		System.out.println("Enter salary:");
		sal=obj.nextFloat();
		
		
	}
	
	public void printDetails()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+sal);
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ScannerDemo ob=new ScannerDemo();
		ob.getDetails();
		ob.printDetails();

	}

}
