//Write a Java program to compare two sets and retain elements which are 
//same on both sets.
package module2;

import java.util.HashSet;

public class Pr_63 {
	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add("red");
		h1.add("white");
		h1.add("orange");
		h1.add("blacck");
		System.out.println("print set 1.."+h1);
		HashSet h2=new HashSet();
		h2.add("red");
		h2.add("green");
		h2.add("orange");
		h2.add("pink");
		System.out.println("print set 2.."+h2);
		h1.retainAll(h2);
		System.out.println("hashset contain..");
		System.out.println(h1);
	}

}
