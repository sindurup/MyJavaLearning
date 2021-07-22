package package2;

public class BreakDemo
{

	public static void main(String[] args)
	{
		int num=0;
		//outerBrk is name of label , if we break label the outer will break
	   outerBrk:for(int i=0;i<10;i++)
	   {
		   for(int j=0;j<10;j++)
		   {
			   if(i==5 && j==5)
			   {
				   break outerBrk;
				   
			   }
			   num++;
		   }
	   }
	   System.out.println("Num:"+num);
	   
	   ////outerBrkCon is name of label
	   
	   outerBrkCon:for(int i=0;i<10;i++)
	   {
		   for(int j=0;j<10;j++)
		   {
			   if(i==5 && j==5)
			   {
				   continue outerBrkCon;
				   
			   }
			   num++;
		   }
	   }
	   
	   System.out.println("Num:"+num);
	   
	   
	}

}
