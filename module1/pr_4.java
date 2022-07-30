package module1;

import java.util.Scanner;

public class pr_4 {
	public static void main(String[] args) {
		int sum=0;
		int i=0,avg=0;
		Scanner sc=new Scanner(System.in);
		
		while(i<5)
		{
			
		
		System.out.println("entre  number");
		int no=sc.nextInt();
		sum+=no;
		i++;
		
		}
		System.out.println("ypur sum is.."+sum);
		avg=sum/5;
		System.out.println("your avarage is.."+avg);
		
	}

}
