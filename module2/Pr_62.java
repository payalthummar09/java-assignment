//Write a Java program to print all the elements of an ArrayList using the 
//position of the elements.
package module2;

import java.util.ArrayList;

public class Pr_62 {
	public static void main(String[] args) {
		ArrayList a=new	ArrayList();
		a.add("red");
		a.add("white");
		a.add("black");
		a.add("orange");
		System.out.println("originbal list is.."+a);
		System.out.println("printing using index of element..");
		int no_of_ele=a.size();
		for(int i=0;i<no_of_ele;i++)
		{
			System.out.println(a.get(i));
		}
		
		
	}

}
