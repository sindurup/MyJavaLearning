package ThreadDemoPack;

class Counter
{
	int count;
	//when more threads are working on same method, if we use synchronized method then it will 
	//make thread to wait till the other thread completes
	public synchronized void increment()
	{
		count++;
	}
}

public class SynchronizedThreadClass 
{

	public static void main(String[] args) throws InterruptedException
	{
		Counter c=new Counter();
		Thread t1=new Thread(new Runnable(){
			
			public void run()
			{
				for(int i=1;i<=1000;i++)
				{
					c.increment();
				}
			}
			
			
		});
		
		Thread t2=new Thread(new Runnable() {
			
			public void run()
			{
				for(int i=1;i<=1000;i++)
				{
					c.increment();
				}
			}
			
			
			
		});
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		
		
		
		System.out.println(c.count);

	}

}
