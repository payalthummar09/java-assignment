package module2;
class abc
{
	int fact=1;
	public void factorial(int n)
	{
		for(int i=1;i<n;i++)
		{
		
		fact=fact*n;
		
		}
		System.out.println("factorial of "+n+"is "+fact);
		
	}
}

public class pr_18 {
	public static void main(String[] args) {
		abc a=new abc();
		a.factorial(5);
	}
	

}
