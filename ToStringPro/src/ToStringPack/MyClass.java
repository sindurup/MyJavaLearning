package ToStringPack;

//whenever we create a class it extends from Object class
	class Student //extends Object
	{
		int id;
		String name;
		
		public Student(int id, String name)
		{
			super();
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() 
		{
			return "Student [id=" + id + ", name=" + name + "]";
		}
		
		
		//toString is an method in Object class
		
		
	}

public class MyClass
{
		

	public static void main(String[] args)
	{
		Student s=new Student(1,"ABC");
		
		System.out.println(s);
	}
	
	

}
