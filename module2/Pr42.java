/*Write a Java program to remove the third element from an array list.*/
package module2;

import java.util.ArrayList;

public class Pr42 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		System.out.println("array list is..");
		a1.add("red");
		a1.add("orange");
		a1.add("white");
		a1.add("black");
		a1.add("blue");
		System.out.println(a1);
		a1.remove(3);
		System.out.println(a1);
	}

}
