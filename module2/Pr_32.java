// W.A.J. P to create one thread by extending Thread class in another Class
package module2;
class threadAnother extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hi! i am thread of another class..");
		}
	}
}
public class Pr_32 {
	public static void main(String[] args) {
		threadAnother t1=new threadAnother();
		t1.start();
	}

}
