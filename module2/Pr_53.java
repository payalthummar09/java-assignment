/*Write a Java program to extract a portion of an array list.*/
package module2;

import java.awt.List;
import java.util.ArrayList;

public class Pr_53 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	
	System.out.println("array list is..");
	a1.add("red");
	a1.add("orange");
	a1.add("white");
	a1.add("black");
	a1.add("blue");
	System.out.println(a1);
	List ex= a1.subList(2, 4);
	System.out.println(ex);
}
}      