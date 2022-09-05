package module2;

import java.util.Scanner;

public class Pr_23 {
	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("entre no1 ..");
		int no1=sc.nextInt();
		System.out.println("entre no2 ..");
		int no2=sc.nextInt();
		int c=no1/no2;
		System.out.println("division is.."+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("you can not  divide by 0");
			
		}
	}

}
