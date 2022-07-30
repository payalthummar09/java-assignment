package module2;
abstract class bank
{
	abstract public void getBalance(int a);
	
}
class bankA extends bank
{

	@Override
	public void getBalance(int a) {
		System.out.println("you deposited  in BankA is "+a);
		
	}
	
}
class bankB extends bank
{

	@Override
	public void getBalance(int a) {
		System.out.println("you deposited in BankB is "+a);
		
	}
	
}

class bankC extends bank
{

	@Override
	public void getBalance(int a) {
		System.out.println("you deposited  in Bankc is "+a);
		
	}
	
}

 

public class pr_16 {
	public static void main(String[] args) {
		bankA bA=new bankA();
		bA.getBalance(100);
		bankB bB=new bankB();
		bB.getBalance(150);
		bankC bC=new bankC();
		bC.getBalance(200);
		
	}

}
