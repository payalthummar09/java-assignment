//Write a Java program to replace the second element of an ArrayList with 
//the specified element.
package module2;

import java.util.ArrayList;

public class Pr_61 {
	public static void main(String[] args) {
		

	ArrayList a1=new ArrayList();
	a1.add("red");
	a1.add("green");
	System.out.println("original list is.."+a1);
	String new_color="white";
	a1.set(1, new_color);
	int num=a1.size();
	System.out.println("replace second element with 'white'..");
	for(int i=0;i<num;i++)
	{
		System.out.println(a1.get(i));
	}
	
	}
}
