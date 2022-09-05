/*Write a Java program to insert an element into the array list at the first 
position*/

package module2;

import java.util.ArrayList;

public class Pr39 {

		public static void main(String[] args) {
			ArrayList a1=new ArrayList();
			System.out.println("array list is..");
			a1.add("red");
			a1.add("orange");
			a1.add("white");
			a1.add("black");
			a1.add("blue");
			System.out.println(a1);
			a1.add(0,"sky");
			System.out.println(a1);
		}
	}
	


