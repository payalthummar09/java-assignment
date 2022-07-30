package module1;

import java.util.Scanner;

public class pr_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no1..");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int no3=sc.nextInt();
		if(no1>no2 && no1>no3)
		{
			System.out.println("no1 is greatest");
		}
		else if(no2>no3 && no2>no1)
		{
			System.out.println("no2 is greatest");
		}
		else
		{
			System.out.println("no 3 is greatest");
		}
	}

}
