package fileReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
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
			//System.out.println("lines");
			
			
			var lines=Files.readAllLines(Paths.get("D:\\Hello.txt"));
			System.out.println("lines="+lines);
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
				
				//System.out.println(data[0]);	
			
			
			
			
			
		//	System.out.print(data[0].equals(name));
			if(data[0].equals(name))
			{
				//System.out.println(data[1]);
				//studentScores.add(Integer.parseInt(data[1]));
				studentScores.add(Integer.parseInt(data[1]));
				isFound=true;
			}
			}
			
			if(isFound)
			{
				for(var i:studentScores)
					System.out.println(i);
			}
			else
			{
				System.out.println("Student is abscent");
			}
		
				

	
	}
		catch(FileNotFoundException ex)
		{
			System.out.println("File not found");
		}
		
		catch(InvalidPathException ex2)
		{
			System.out.println("path not valid");
		}
		
	
		catch (IOException ex1) 
		{
			System.out.println("IO exception");
		}
}
}
