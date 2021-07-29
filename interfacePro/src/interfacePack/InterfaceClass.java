package interfacePack;


class A
{
	public void show()
	{
		System.out.println("In class A");
	}
}

interface Writer
{
	public abstract void write();
}

class Pen implements Writer
{
	public void write()
	{
		System.out.println("Pen");
	}
}


class Pencil implements Writer
{
	public void write()
	{
		System.out.println("Pencil");
	}
}

class ABC extends A implements Writer
{
	public void write()
	{
		System.out.println("Class ABC");
	}
	
	public void show()
	{
		System.out.println("Hello....");
	}
}


//types of interfaces

//1. Normal ---1 or more methods
//2.single abstract method -----single method for lambda expressions
//3.Marker interface -----no methods

public class InterfaceClass 
{

	public static void main(String[] args) 
	{
		
		//we can not create object for interface
		Writer p=new Pen();
		p.write();
		
		Writer pc=new Pencil();
		pc.write();
		
		Writer obj=new ABC();
		obj.write();
		//obj.show();
		
		ABC obj1=new ABC();
		obj1.show();
				
			
				
	}

}
