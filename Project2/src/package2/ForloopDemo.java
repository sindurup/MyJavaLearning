package package2;

public class ForloopDemo {

	public static void main(String[] args) 
	{
		int[] array= {0,1,2,3,4,5,6,7,8,9};
		int[] array1= {2,3,4,5,6,7};
		
		int i=0,j=0;
		
		
		//for(i=0,j=0;i<array.length && j<array.length;i++,j++)
		
		for(;i<array.length && j<array.length;i++,j++)
		{
			System.out.println(array[i]+" "+array[j]);
		}
		
		
		//print statment in for loop itself
		System.out.println("**************************");
		for(i=0;i<array.length;System.out.println(array[i++]));
		
		System.out.println("**************************");
		//printing 2 arrays
		
		for(i=0,j=0;i<array.length && j<array1.length;System.out.println(array[i++]+"---"+ array1[j++]));
		System.out.println("**************************");
		//skipping by 2
		
		for(i=0;i<array.length;i+=2)
		{
			System.out.println(array[i]);
		}
		System.out.println("**************************");
		//reverse order
		
		for(i=array.length-1;i>=0;i--)
		{
			System.out.println(array[i]);
		}
		System.out.println("**************************");
		//swapping of elements in array
		
		for(i=0,j=array.length-1;i<j;i++,j-- )
		{
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
			for(int d:array)
				System.out.print(d+"");
				
				
			System.out.println("**************************");
			
			//Counting devisors
			int x=24,count=0;
			for(i=1;i<=x;i++)
			{
				if(x%i==0)
				{
					System.out.print(i+"");
					count++;
				}
			}
			
			System.out.println("no.of devisors:"+count);
			
		//*************$$$$$$$$$$$$$********************************************
			
	//nested loops
			
			int[][] studentGrds= {{56,67,89,90},{43,76,54,89},{67,76,54,66}};
			
			for(i=0;i<studentGrds.length;i++)
			{
				int max=0;
				System.out.println("Display marks of  grades "+i);
				
				for(j=0;j<studentGrds[i].length;j++)
				{
					if(studentGrds[i][j]>max)
					{
						max=studentGrds[i][j];
					}
					System.out.println("Grades:"+studentGrds[i][j]);
				}
				
				System.out.println("Max:"+max);
				
			}
			
	}

}
