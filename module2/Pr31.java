/*W.A.J. P to create one thread by implementing Runnable interface in 
Class*/


package module2;
class runablethread implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("this is runnable method..");
		}
		
	}
	
	
}

public class Pr31 {
	public static void main(String[] args) {
		runablethread rn=new runablethread();
		Thread t=new Thread(rn);
		t.start();
		
	}

}
