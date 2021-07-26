package simpliLearnPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressions 
{

	public static void main(String[] args) 
	{
		//regular expressions
		
		//Pattern p=Pattern.compile("[a-z]{3}");
		//Pattern p=Pattern.compile("[a-zA-z]{3}");
		//Pattern p=Pattern.compile("[a-zA-z]{1,3}");
		//Pattern p=Pattern.compile("[a-zA-z]{2,}");
		//Pattern p=Pattern.compile("[a-zA-z]{3}[0-9]*");
		//Pattern p=Pattern.compile("[a-zA-z]{3}[0-9].");
		//Pattern p=Pattern.compile("[a-zA-z]{3}\\D");
		
		//email validation
		
		/*
		 * Pattern p=Pattern.compile("^(.+)@(.+)$");		
		
		   Matcher m=p.matcher("srivani@gmail.com");
		
		*/
		
		//--------------------------------
		//Phone number validation
		
		//(0/91): number starts with (0/91)  
		//[7-9]: starting of the number may contain a digit between 0 to 9  
		//[0-9]: then contains digits 0 to 9  
		
		Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9}");		
		
		Matcher m=p.matcher("9885535635");
		
		
		
		if(m.matches())
		{
			System.out.println("Valid");
		}
		else
			System.out.println("invalid");

	}

}

