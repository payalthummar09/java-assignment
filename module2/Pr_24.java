package module2;

import java.util.Scanner;

public class Pr_24 {
	public static void main(String[] args) {
		try {
			
			
			int[] a=new int[5];
			//a[5]=100/5;
			
			
			for(int i=0;i<6;i++)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("entre...");
				a[i]=sc.nextInt();
			}
			for(int i=0;i<5;i++)
			{
				System.out.println(a[i]+" ");
			}
			
		
		}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic error occurs..");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("array index is out of bound is occurs..");
			}
//		    catch(Exception e)  
//           {  
//                System.out.println("Parent Exception occurs");  
//           }  
		}
	

}
