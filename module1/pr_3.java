package module1;

import java.util.Scanner;

public class pr_3 {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("entre year...");
		int year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println("year is leap year..");
		}
		else
		{
			System.out.println("year is not leap year..");
		}
		
		
		
	}

}
