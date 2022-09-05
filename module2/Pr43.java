/*Write a Java program to search an element in an array list.*/
package module2;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr43 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("array list is..");
		a1.add("red");
		a1.add("orange");
		a1.add("white");
		a1.add("black");
		a1.add("blue");
		System.out.println(a1);
		System.out.println("entre element you want to search..");
	
		String e=sc.next();
		if(a1.contains(e))
		{
			System.out.println("element prasant in list...and index is.."+a1.indexOf(e));
		}
		else
		{
			System.out.println("element is not prasant in list.");
		}
	}
	

}
