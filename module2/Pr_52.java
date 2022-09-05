/*Write a Java program to reverse elements in an array list.*/
package module2;

import java.util.ArrayList;
import java.util.Collections;

public class Pr_52 {
	public static void main(String[] args) {
        ArrayList a1=new ArrayList();
		
		System.out.println("array list is..");
		a1.add("red");
		a1.add("orange");
		a1.add("white");
		a1.add("black");
		a1.add("blue");
		System.out.println(a1);
		Collections.reverse(a1);
		System.out.println(a1);
	}

}
