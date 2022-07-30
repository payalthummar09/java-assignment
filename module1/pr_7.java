package module1;

import java.util.Scanner;

public class pr_7 {
	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("entre number..");
		long no=sc.nextInt();
		
		if(no>0 && no<10000000)
		{
		while(no!=0)
		{
			no=no/10;
			count++;
			
		}
		System.out.println("sum of digit is.."+count);
		}
		else
		{
			System.out.println("enter positive number");
		}
	}

}
