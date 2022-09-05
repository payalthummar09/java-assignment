/*Write a Java program to copy one array list into another.*/
package module2;

import java.util.ArrayList;
import java.util.Collections;

public class Pr_45 {
	public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        ArrayList a2=new ArrayList();
		System.out.println("array list is..");
		a1.add("red");
		a1.add("orange");
		a1.add("white");
		a1.add("black");
		a1.add("blue");
		System.out.println("array list 1.."+a1);
		a2.add(1);
		a2.add(2);
		a2.add(3);
		a2.add(4);
		a2.add(5);
		Collections.copy(a2, a1);
		System.out.println("array list 2.."+a2);
	}

}
