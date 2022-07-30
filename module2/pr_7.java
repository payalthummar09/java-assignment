package module2;
class PrintNumber
{
	public void printn(int a)
	{
		System.out.println("interger number is.."+a);
	}
	public void printn(float a)
	{
		System.out.println("interger number is.."+a);
	}
	public void printn(double a)
	{
		System.out.println("interger number is.."+a);
	}
	public void printn(String a)
	{
		System.out.println("interger number is.."+a);
	}
}

public class pr_7 {
	public static void main(String[] args) {
		PrintNumber print=new PrintNumber();
		print.printn(12);
		print.printn(12.22);
		print.printn(12.2245);
		print.printn("payal");
		
	}

}
