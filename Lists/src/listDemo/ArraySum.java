package listDemo;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) 
	{
       int MAX=5;
       int[] data=new int[MAX];
       
       int sum=0,avg;
       
       Scanner obj=new Scanner(System.in);
      
       for(int i=0;i<MAX;i++)
       {
    	   System.out.println("Enter Values:");
    	   data[i]=obj.nextInt();
    	   
       }
       for(int d:data)
    	   sum+=d;
       avg=sum/MAX;
       
       System.out.println("Total:"+sum);
       System.out.println("Average:"+avg);
       
       

	}

}
