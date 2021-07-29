package encapsulationPack;

//Enacapsulation is binding data with methods

//variables-private
//methods-public

class Student
{
	private int rollNo;
	private String name;
	


	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class EncapsulationClass {

	public static void main(String[] args)
	{
		Student obj=new Student();
		obj.setRollNo(5);
		obj.setName("abcd");
		System.out.println("roll no:"+ obj.getRollNo());
		System.out.println("name:"+ obj.getName());

	}

}
