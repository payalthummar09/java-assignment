/*Write a Java program to compare two array lists.*/
package module2;

import java.util.ArrayList;

public class Pr_54 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		System.out.println("array list is..");
		a1.add("red");
		a1.add("orange");
		a1.add("white");
		a1.add("black");
		a1.add("blue");
		System.out.println(a1);
ArrayList a2=new ArrayList();
		
		System.out.println("array list is..");
		a2.add("red");
		a2.add("orange");
		a2.add("white");
		a2.add("black");
		a2.add("blue");
		a2.add("green");
		System.out.println(a2);
		
		if(a1.equals(a2))
		{
			System.out.println("list are same..");
		}
		else
		{
			System.out.println("list are differnt..");
		}
	}

}
