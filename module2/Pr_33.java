/* W.A.J.P to create 2 threads and execute that threads by providing sleep 
time as 2000ms and check the execution*/

package module2;
class first extends Thread
{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("my first class is.."+i);
		}
		System.out.println("my first class is complete");
		
	}
	
}

public class Pr_33 {
	public static void main(String[] args) {
		
		Thread t1=new Thread();
		t1.start();
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("my main method is.."+i);
		}
		System.out.println("my main method is complete..");
		first f=new first();
		f.start();
	}
	
}
