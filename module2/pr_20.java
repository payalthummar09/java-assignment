package module2;

import java.util.Scanner;

public class pr_20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entre your mark..");
		int mark=sc.nextInt();
		if(mark<=100)
		{
			if(mark>91 && mark<100)
			{
				System.out.println("grade is:..AA");
			}
			else if(mark>81 && mark<=90)
			{
				System.out.println("grade is:..AB");
			}
			else if(mark>71 && mark<=80)
			{
				System.out.println("grade is:..BB");
			}
			else if(mark>61 && mark<=70)
			{
				System.out.println("grade is:..BC");
			}
			else if(mark>51 && mark<=60)
			{
				System.out.println("grade is:..CD");
			}
			else if(mark>41 && mark<=50)
			{
				System.out.println("grade is:..DD");
			}
			else if(mark<=40)
			{
				System.out.println("sorry! you are fail.");
			}
			
		}
		else
		{
			System.out.println("please entre mark under 100....");
		}
	}

}
