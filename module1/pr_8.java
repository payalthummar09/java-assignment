package module1;

import java.util.Scanner;

public class pr_8 {
	public static void main(String[] args) {
		String  s;
		Scanner sc=new Scanner(System.in);
		System.out.println("entre your string..");
		s=sc.nextLine();
		count(s);
	}
		
		public static void count(String x)
		{
			char[] ch=x.toCharArray();
			
		int letter=0;
		int number=0;
		int space=0;
		int other=0;
		
		
		
		for(int i=0;i<x.length();i++)
		{
			
		 if(Character.isLetter(ch[i]))
		{
			letter++;
		}
		else if(Character.isDigit(ch[i]))
		{
			number++;
		}
		else if(Character.isSpace(ch[i]))
		{
			space++;
		}
		else
		{
			other++;
		}
		
	}
		System.out.println("letter is.. "+letter);
		System.out.println("digit is.. "+number);
		System.out.println("space is.. "+space);
		System.out.println("other word is "+other);
		
}

}
