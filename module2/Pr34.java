/*W.A.J.P to start the same Thread twice by calling start () method twice.
Test ThreadTwice1 t1=new TestThreadTwice1(); 
t1.start ();
t1.start ()*/

package module2;

class TestThreadTwice1 extends Thread
{
	public void run()
	{
		System.out.println("runing...");
	}
}
public class Pr34 {
	public static void main(String[] args) {
		TestThreadTwice1 t1=new TestThreadTwice1(); 
		t1.start();
		t1.start();
		
	}

}
