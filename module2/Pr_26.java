package module2;

import java.util.Scanner;

public class Pr_26 {
	public static void main(String[] args) {
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("entre no 1..");
		int no1=sc.nextInt();
		System.out.println("entre no 2..");
		int no2=sc.nextInt();
		int c=no1/no2;
		System.out.println("division is.."+c);
		}
		catch(Exception e)
		{
			System.out.println("arithmetic error");
		}
	}

}
