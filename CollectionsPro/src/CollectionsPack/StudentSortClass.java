package CollectionsPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//to sort students calss we need to implement comparable interface
class Students implements Comparable<Students>
{
	int id,marks;
	String name;
	public Students(int id,String name, int marks)
	{
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
	}
	
	@Override
	public String toString() 
	{
		return "Students [id=" + id + ", marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Students o)
	{
	//	return marks>o.marks?1:-1;
		
		return name.length()>o.name.length()?1:-1;
		
	}
	
	
}


public class StudentSortClass
{

	public static void main(String[] args) 
	{
		List<Students> st =new ArrayList<Students>();
		
		st.add(new Students(100,"AAshu",89));
		st.add(new Students(101,"Aarna",90));
		st.add(new Students(102,"Apoorva",76));
		st.add(new Students(103,"Anoushka",97));
		
		Collections.sort(st);
		
		//for(Students s:st)
			System.out.println(st);
		
		
		

	}

}
