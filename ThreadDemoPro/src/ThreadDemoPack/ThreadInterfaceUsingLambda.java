package ThreadDemoPack;

public class ThreadInterfaceUsingLambda {

	public static void main(String[] args) throws InterruptedException {
		Runnable obj1 = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (Exception ex) {

				}
			}

		};

		Runnable obj2 = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (Exception ex) {

				}
			}
		};
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception ex) {

		}
		
		t2.start();

		try {
			Thread.sleep(10);
		} catch (Exception ex) {

		}
		
		//to check priority of thread we use getpriority 
		//priority ranges from 1-10 ,1 is less and 10 is high
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		//we can set priority using setpriority
		t1.setPriority(1);
		t2.setPriority(1);
		
		//to give constant priority
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		//to check thread is alive or not use isAlive
		System.out.println(t2.isAlive());
		
		//to check name of the thread
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		//to set name for thread
		t1.setName("Hi Thread");
		t2.setName("Hello Thread");
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
			
	
		//to print bye at the last we need to tell threads to wait for that reason we are using join methods
		t1.join();
		t2.join();
		
		System.out.println("Bye");
		
		System.out.println(t2.isAlive());
		
		

	}
}
