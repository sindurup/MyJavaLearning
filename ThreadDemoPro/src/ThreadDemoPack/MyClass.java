package ThreadDemoPack;

class Hi extends Thread
{
	//run is a method in Thread class, we need to over write it
    public void run()
    {
    	for(int i=1;i<=5;i++)
    	{
    		System.out.println("Hi");
    		try
    		{
    			Thread.sleep(1000);
    		}
    		catch(Exception ex)
    		{
    			
    		}
    	}
    	
    }
	
}

class Hello extends Thread
{
	//run is a method in Thread class, we need to over write it
    public void run()
    {
    	for(int i=1;i<=5;i++)
    	{
    		System.out.println("Hello");
    		try
    		{
    			Thread.sleep(1000);
    		}
    		catch(Exception ex)
    		{
    			
    		}
    	}
    	
    }
	
}

public class MyClass {

	public static void main(String[] args)
	{
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		
		obj1.start();
		try
		{
			Thread.sleep(10);
		}
		catch(Exception ex)
		{
			
		}
		obj2.start();
		
		
		
		

	}

}
