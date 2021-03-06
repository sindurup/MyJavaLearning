package com.LockedMe;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class LockedMe {

	public static final String FILEPATH = "D:\\Phase1Project\\Files\\";

	public static void main(String[] args) throws Exception {

		// Variable declaration
		int ch;
		int proceed = 1;
	try
	{
			do {
			displayMenu();
			Scanner obj = new Scanner(System.in);

			// Taking user input
			System.out.println("Enter your choice:");
			ch = Integer.parseInt(obj.next());
			
			// Using switch case to perform operations
			switch (ch) {
			case 1:
				showNames();
				break;
			case 2:
				createFile();
				break;
			case 3:
				deleteFile();
				break;
			case 4:
				searchFile();
				break;
			case 5:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid input");
				break;
			}
		} while (proceed > 0);

	}
	catch(Exception ex)
	{
		System.out.println("Some error occured");
		
	}
}

	/**
	 * Display Menu items
	 * 
	 * @return int
	 */

	public static void displayMenu() {

		System.out.println("===================================================");
		System.out.println("\t\tLockedMe.com");
		System.out.println("===================================================");
		System.out.println();
		System.out.println("\t1.Display All Files");
		System.out.println("\t2.Create a File");
		System.out.println("\t3.Delete a File");
		System.out.println("\t4.Search a File");
		System.out.println("\t5.Exit");
		// System.out.println("Enter your choice:");

	}

	public static void createFile() {
		// Creating class object
		FileManager fm = new FileManager();
		fm.createFile();
	}

	public static void showNames() {
		List<String> fNames = FileManager.getFiles();
		for (String f : fNames)
			System.out.println(f);

	}

	public static void searchFile() {
		// variable declaration
		boolean isFound = false;
		// Creating class object
		FileManager fm = new FileManager();

		isFound = fm.searchFile();

		// Testing file existence
		if (isFound)
			System.out.println("File Found");
		else
			System.out.println("File not Found");
	}

	public static void deleteFile() {
		// variable declaration
		boolean isDelete = false;
		// Creating class object
		FileManager fm = new FileManager();

		isDelete = fm.deleteFile();

		if (isDelete)
			System.out.println("File Deleted");
		else
			System.out.println("File not Deleted");

	}

}
