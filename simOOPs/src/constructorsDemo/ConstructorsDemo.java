package constructorsDemo;

import java.util.Scanner;

public class ConstructorsDemo
{
  private String name;
  private int sal;
  private int age;
  
  
  // without using constructors reading data
  //---start----------------------------------------------
  public void readData()
  {
	  Scanner obj=new Scanner(System.in);
	  
	  System.out.println("Enter name:");
	  name=obj.nextLine();
	  
	  System.out.println("Enter age:");
	  age=obj.nextInt();
	  
	  System.out.println("Enter salary:");;
	  sal=obj.nextInt();
	  
	  obj.close();	  
	  
  }
  
  //----end-----------------------------------------
  
  //using constructors
  //-----------------------------------------------
  // no parameterized constructor
  ConstructorsDemo()
  {
	  name="Nick";
	  age=37;
	  sal=5000;
  }
  //---------------------------------------
  
  
  //Parameterized constructor
  //------------------------------------
  
  ConstructorsDemo(String name,int age,int sal)
  {
	  this.name=name;
	  this.age=age;
	  this.sal=5000;
  }
  
  //---------------------------------------
  
  
  //------------------------------------------------
  
  public void printData()
  {
	  System.out.println(name);
	  System.out.println(age);
	  System.out.println(sal);
  }
  
  
	
}
