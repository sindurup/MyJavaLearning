package package2;
import java.util.*;

public class StaticMethodDemo 

{
  
	int rollNo;
	String name;
	static String college="MG";
	
	static void change()
	{
		college="MGIT";
	}
	StaticMethodDemo(int r,String sName)
	{
		rollNo=r;
		name=sName;
	}
	
	void display()
	{
		System.out.println("Student details:"+rollNo+" "+name+" "+college);
		
	}
	
	public static void main(String[] args) {
		
		change();
		StaticMethodDemo s1=new StaticMethodDemo(100,"aaaa");
		StaticMethodDemo s2=new StaticMethodDemo(101,"bbbb");
		StaticMethodDemo s3=new StaticMethodDemo(102,"cccc");
		s1.display();
		s2.display();
		s3.display();
		
		// TODO Auto-generated method stub
		//concat demo
       String st1="aaaa";
       st1=st1.concat("bbbb");
       System.out.println(st1);
       
       //string split demo
       
       String st2="java is a platform independent";
       
       System.out.println(st2.substring(2, 4));
       System.out.println(st2.substring(2));
       
      // System.out.println(st2.replace(2, 4,F));
       
       String[] words=st2.split("//s");
       for(String w:words)
       {
    	   System.out.println(w);
       }
       
       
	}

}
