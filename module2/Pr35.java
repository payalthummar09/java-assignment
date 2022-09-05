/*W.A.J.P to set the user defined name, priority and get that name and 
priority for 2 threads using setName (), setPriority (), getName (), 
getPriority () methods of Thread class.
TestMultiPriority1 m1=new TestMultiPriority1 (); TestMultiPriority1 
m2=new TestMultiPriority1 ();
m1.setName (“mythread-1”); 
m2.setName (“mythread- 2”); 
m1.setPriority (Thread.MIN_PRIORITY);
m2.setPriority (Thread.MAX_PRIORITY); 
m1.start ();
m2.start ();*/
package module2;

class 	TestMultiPriority1 extends Thread

{
	String name;
	int priority;
	public void run()
	{
		System.out.println("this thread is running..");
		
	}
	
	
}

public class Pr35 {
	public static void main(String[] args) {
			
		TestMultiPriority1 m1=new TestMultiPriority1 ();
		TestMultiPriority1 m2=new TestMultiPriority1 ();
		m1.setName ("mythread-1"); 
		m2.setName ("mythread- 2"); 
		m1.setPriority (Thread.MIN_PRIORITY);
		m2.setPriority (Thread.MAX_PRIORITY); 
		m1.start ();
		m2.start ();
		System.out.println("thread1 name is.."+m1.getName());
		System.out.println("thread priority is.."+m1.getPriority());
		System.out.println("thread2 name is.."+m2.getName());
		System.out.println("thread 2 priority is.."+m2.getPriority());
		
						
		}

	}


