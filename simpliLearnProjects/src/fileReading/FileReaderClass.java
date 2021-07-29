package fileReading;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;



public class FileReaderClass
{

	public static void main(String[] args)
	{
		File f1;
		FileReader fr;
		String[] data=new String[] {};
	
		
		try
		{
			
			var lines=Files.readAllLines(Paths.get("‪D://Hello.txt"));
			System.out.println(lines);
			boolean isFound=false;
			Scanner obj=new Scanner(System.in);
			String name;
			int score=0;
			ArrayList<Integer>studentScores=new ArrayList<Integer>();
			System.out.println("Enter student name");
			name=obj.next();
			for(String a:lines)
			{
				 data=a.split(",");
				
				
			}
			
			
			if(data[0].equals(name))
			{
				studentScores.add(Integer.parseInt(data[1]));
				isFound=true;
			}
			
			if(isFound)
			{
				for(int i:studentScores)
					System.out.println(i);
			}
			else
			{
				System.out.println("Student is abscent");
			}
		
				

	
	}
		catch(Exception ex)
		{
			
		}
		
	

}
}
