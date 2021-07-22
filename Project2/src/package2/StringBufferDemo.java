package package2;

public class StringBufferDemo
{

	public static void main(String[] args) 
	{
		String s="hello"+" "+"world";
		StringBuffer sb=new StringBuffer(s);
		sb.append(" good").append(" morning").append(" !!!");
		System.out.println("Sb:"+sb.toString());
		System.out.println("length:"+sb.length());
		
		sb.delete(1, 5);
		
		System.out.println("Sb:"+sb.toString());
		
		sb.insert(1, "ey");
		System.out.println("Sb:"+sb.toString());
		
		//StringBuilder
		
		System.out.println("*********************************");
		
		StringBuilder sb1=new StringBuilder(s);
		sb1.append(" good").append(" morning").append(" !!!");
		System.out.println("Sb:"+sb1.toString());
		System.out.println("length:"+sb1.length());
		
		sb1.delete(1, 5);
		
		System.out.println("Sb:"+sb1.toString());
		
		sb1.insert(1, "ey");
		System.out.println("Sb:"+sb1.toString());
		
		
		

	}

}
