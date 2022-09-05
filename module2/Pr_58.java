//Write a Java program to convert a hash set to a List/ArrayList
package module2;

import java.util.ArrayList;
import java.util.HashSet;

public class Pr_58 {
	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add("a");
		h1.add("b");
		h1.add("c");
		h1.add('d');
		System.out.println("heshset list is.."+h1);
		 ArrayList list = new ArrayList(h1);
		 
	     // Display ArrayList elements
	     System.out.println("ArrayList contains: "+ list);
	}
	

}


