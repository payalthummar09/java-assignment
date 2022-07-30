package module2;

class printNumber1
{
	public void print(int n,char c)
	{
		System.out.println("your integer no is = "+n+" your charecter  is = "+c);
		
	}
	public void print(char c,int n)
	{
		System.out.println(" your charecter  is = "+c+" your integer no is= "+n);
		
	}
}

public class pr_8 {
	public static void main(String[] args) {
		printNumber1 print=new printNumber1();
		print.print(10, 'a');
		print.print('b', 20);
	}
	

}
