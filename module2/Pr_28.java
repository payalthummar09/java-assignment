package module2;
class Aerror
{
	public void method(int n)
	{
		
			try
			{
			if(n<18)
			{
				throw new ArithmeticException("Arithmetic exception occur..");
			}
			
			}
			
		
			catch(ArithmeticException e)
			{
				System.out.println("error..");
		    }
			
		
	} 
}

public class Pr_28 {
	public static void main(String[] args) {
		Aerror e=new Aerror();
		e.method(15);
	}

}
