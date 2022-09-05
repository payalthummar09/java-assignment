/*W.A.J.P to create 2 threads and make one thread as Daemon Thread by 
using set Daemon () method of Thread class and check whether the thread 
is set daemon or not by using is Daemon () method.
 TestDaemonThread2 t1=new TestDaemonThread2(); 
TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();
 t1.setDaemon(true);//will throw exception here t2.start();*/

package module2;
class testDemo1 extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("this is deamon thread");
		}
		else
		{
			
		System.out.println("this is normal thread");
		}
	}
}
class testDemo2 extends Thread
{
	public void run()
	{
		
			System.out.println("this is second thread");
		
	}
}

public class Pr_36 {
	public static void main(String[] args) {
		testDemo1 t1=new testDemo1();
		t1.setDaemon(true);//setdeamon(0 method for set current thread as deamon
		t1.start();
		
		testDemo2 t2=new testDemo2();
		t2.start();
				
	}

}
