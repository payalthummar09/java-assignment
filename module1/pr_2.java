package module1;

import java.util.Scanner;

public class pr_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your input...");
		char a=sc.next().charAt(0);
		
		
		if(a>='a' ||a<='z' && a>='A' ||a<='Z')
		{
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u' && a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
			{
				System.out.println("youy enter vovels...");
			}
			else
			{
				System.out.println("you entre consonants");
			}
			
		}
		
		else
		{
			System.out.println("sorry! wrong input");
		}
				
	}
}
