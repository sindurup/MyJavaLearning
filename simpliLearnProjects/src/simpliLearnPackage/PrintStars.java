package simpliLearnPackage;

public class PrintStars
{

	public static void main(String[] args) 
	
	{
 /*
  * Printing
  * 
 *     * * *
 *     * * *
 *     * * *
 *     * * *
 * 
*/
		int i,j;
		
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=3;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.print("\n");
		}
		
		
		
		// ________________________________________________
		/*
		 * Printing
		 *   *
		 *   * *
		 *   * * *
		 *   * * * *
		 *   * * * * *
		 *   * * * * * *
		 * 
		 */

		
		for(i=1;i<=6;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print("*"+ " ");
			}
			
			System.out.print("\n");
		}

	}

}
