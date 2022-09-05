package module2;

import java.util.Scanner;

class error extends Exception
{
	error(String error)
	{
		super(error);
	}
}

public class Pr_27 {
	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("entre no ..");
			int no=sc.nextInt();
			if(no<10 || no>40)
			{
				throw(new error("invalid mark.."+no));
			}
			System.out.println("entre mark are .."+no);
		}
		catch(error e)
		{
			System.out.println("error.."+e);
		}
		
	}

}
