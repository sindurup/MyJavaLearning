package com.LockedMe;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileManager {

	public static final String FILEPATH = "D:\\Phase1Project\\Files\\";

	/**
	 * Creating and writing file
	 * 
	 * @return void
	 */

	public static void createFile() {

		// Variable declaration
		String fname, str;
		int count;
		int i = 1, j = 1;
		int lCount;
		Scanner obj = new Scanner(System.in);
		BufferedWriter writer = null;

		// taking input from user
		System.out.println("Please enter how many files do you want to create:");
		count = Integer.parseInt(obj.next());

		try {

			do {
				System.out.println("Please enter file name to create:");

				fname = obj.next();
				File f = new File(FILEPATH, fname);

				// Creating new file
				if (f.createNewFile()) {
					System.out.println("File created: " + f.getName());

					System.out.println("Enter how many lines do u want to write in the file:");
					lCount = obj.nextInt();

					writer = new BufferedWriter(new FileWriter(f));
					for (j = 1; j <= lCount; j++) {
						System.out.println("Line" + j + ":");

						str = obj.next();
						writer.write(String.format(str));

						writer.newLine();

					}

				} else {
					if (f.exists())
						System.out.println("File already exists.");

				}

				j = 1;

				// writer.close();

				i++;
			} while (i <= count);

		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	/**
	 * printing file names
	 * 
	 * @return List<>
	 */
	public static List<String> getFiles() {
		// Creating file object
		File f1 = new File(FILEPATH);

		// Fetching all files
		File[] listOfFiles = f1.listFiles();

		// Storing filenames in alist
		List<String> fNames = new ArrayList<String>();

		for (File f : listOfFiles)
			fNames.add(f.getName());
		return fNames;

	}

	/**
	 * Searching File exist or not
	 * 
	 * @return boolean
	 */
	public static boolean searchFile() {
		// variable declaration
		boolean isSearch = false;
		String fName;
		Scanner obj = new Scanner(System.in);

		// Taking input from user
		System.out.println("Enter File name to be searched:");

		try {
			fName = obj.next();

			// Making file name case insensitive using pattern

			Pattern pname = Pattern.compile(fName, Pattern.CASE_INSENSITIVE);

			File f = new File(FILEPATH, pname.toString());

			// Testing of file existence
			if (f.exists()) {
				isSearch = true;
			} else
				isSearch = false;

			return isSearch;
		}

		catch (Exception ex) {
			System.out.println("An error occured");
			return isSearch;
		}
	}

	/**
	 * Delete File
	 * 
	 * @return boolean
	 */
	public static boolean deleteFile() {
		// Variable declaration
		boolean isDelete = false;
		String fName;
		Scanner obj = new Scanner(System.in);
		// Taking input from user
		System.out.println("Enter File name to be deleted:");

		try {
			fName = obj.next();

			// Making file name case insensitive using pattern
			Pattern pname = Pattern.compile(fName, Pattern.CASE_INSENSITIVE);

			File f = new File(FILEPATH, pname.toString());

			// Checking and deleting File and returning boolean value
			if (f.exists()) {

				// flag=1;
				if (f.delete())
					isDelete = true;
				else
					isDelete = false;

				// return isDelete;
			} else {
				// flag=0;
				System.out.println("File not exist to delete");
			}

			return isDelete;
		}

		catch (Exception ex) {
			System.out.println("Some error occured");
			return isDelete;
		}

	}
}
