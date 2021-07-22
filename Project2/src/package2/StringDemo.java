package package2;

public class StringDemo
{
	static void stringMethods()
	{
		String s="Hello world!";
		
		System.out.println("Length="+ s.length());
		
		System.out.println("Is empty="+ s.isEmpty());
		
		System.out.println("Is Equal="+ s.equals("HELLO WORLD"));
		
		System.out.println("Ignore case:"+ s.equalsIgnoreCase("HELLO WORLD"));
		
		System.out.println("compare="+ s.compareTo("HELLO WORLD"));
		
		System.out.println("Contains="+ s.contains("HELLO WORLD"));
		
		System.out.println("Contains="+ s.equals("Hello"));
		
		System.out.println("Starts with="+ s.startsWith("HELLO WORLD"));
		
		System.out.println("Starts with="+ s.startsWith("Hello"));
		
		System.out.println("Ends with="+ s.endsWith("$"));
		
		System.out.println("Ends with="+ s.endsWith("!"));
		
		System.out.println("Index ="+ s.indexOf("h"));
		
		System.out.println("Last Index ="+ s.lastIndexOf("l"));
		
		System.out.println("Char at ="+ s.charAt(5));
		
		System.out.println("substring ="+ s.substring(5));
		
		System.out.println("substring ="+ s.substring(2,5));
		
		
		System.out.println("uppercase ="+ s.toUpperCase());
		
		
		System.out.println("Lowercase ="+ s.toLowerCase());
		
		
		System.out.println("Trim ="+ s.trim());
		
		System.out.println("Replace ="+ s.replace("!","&&"));
		
		//split
		
		String[] sa=s.split("l");
		
		for(String str:sa)
		{
			System.out.println(sa);
		}
		
		//System.out.println("value of ="+String.valueOf(1,3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	public static void main(String[] args)
	{
		stringMethods();

	}

}
