package SelectionSortPack;

public class SelectionSortClass {

	public static void main(String[] args) 
	{
		int[] data=new int[] {45,87,23,98,12,54};
		int index,i,j;
		
		for(i=0;i<data.length;i++)
		{
			index=i;
			for(j=i+1;j<data.length;j++)
			{
				if(data[j]<data[index])
				{
					index=j;
				}
				
			}
				int smallNum=data[index];
				data[index]=data[i];
				data[i]=smallNum;

			
		}
		
		for(int d:data)
		{
			System.out.println(d);
		}
	}

}
