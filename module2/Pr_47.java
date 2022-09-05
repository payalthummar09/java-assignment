/*Write a Java program to append the specified element to the end of a 
hash set.*/

package module2;

import java.util.HashSet;

public class Pr_47 {
public static void main(String[] args) {
	HashSet h1=new HashSet();
	h1.add("a");
	h1.add("b");
	h1.add("c");
	h1.add('d');
	System.out.println(h1);
	h1.add("add");
	System.out.println(h1);
}
}
