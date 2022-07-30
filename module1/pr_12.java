package module1;

import java.util.Scanner;

public class pr_12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	 
	    System.out.println("no is divisible by 3");
		 for(int no=1;no<100;no++)
		 {
			 if(no%3==0)
			 {
			 
			 System.out.print(no+" ," );
			 }
		 }
		 System.out.println();
		 System.out.println("no is divisible by 5");
		 for(int no=1;no<100;no++)
		 {
			 if(no%5==0)
			 {
			 
			 System.out.print(no+" ," );
			 }
		 }
		 System.out.println();
		 System.out.println("no is divisible by 15");
		 for(int no=1;no<100;no++)
		 {
			 if(no%15==0)
			 {
			 
			 System.out.print(no+" ," );
			 }
		 }
		 System.out.println();
}
}
