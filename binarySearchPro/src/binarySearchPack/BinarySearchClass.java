package binarySearchPack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Binary search searches element by sorting

public class BinarySearchClass {

	public static void main(String[] args)
	{
		List<Integer> data=Arrays.asList(56,89,32,23,67,98,53,11,17,24);
		
		Collections.sort(data);
		
		Scanner obj=new Scanner(System.in);
		int searchElement,low,high,mid;
		
		low=0;
		high=data.size();
		mid=(low+high)/2;
		
		System.out.println("Enter number:");
		searchElement=obj.nextInt();
		
		for(int d:data)
		{
			System.out.println(d);
		}
		
	while(true)
	{
		System.out.println("mid"+mid);
		if(searchElement==data.get(mid))
		{
			System.out.println("Elemrnt found at:"+mid);
			break;
		}
		if(mid==low||mid==high)
		{
			System.out.println("Not Found");
			break;
		}
		if(searchElement>data.get(mid))
		{
			low=mid;
		
		}
		else
			high=mid;
		
		mid=(low+high)/2;
		
		
	}
		
		

	}

}
