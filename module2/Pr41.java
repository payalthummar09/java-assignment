/*Write a Java program to update specific array element by given element.*/
package module2;

import java.util.ArrayList;

public class Pr41 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		System.out.println("array list is..");
		a1.add("red");
		a1.add("orange");
		a1.add("white");
		a1.add("black");
		a1.add("blue");
		System.out.println(a1);
		a1.set(2, "Yellow");
		System.out.println(a1);
	}
	

}
