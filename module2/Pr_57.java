/*Write a Java program to convert a hash set to an array.*/
package module2;

import java.awt.List;

import java.util.HashSet;

public class Pr_57 {
	//private static final int hashset=0;
	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add("a");
		h1.add("b");
		h1.add("c");
		h1.add('d');
		System.out.println("heshset list is.."+h1);
		String[] arr=new String[h1.size()];
		h1.toArray(arr);
		System.out.println("array is..");
		for(String element:arr)
		{
		System.out.println(element);
		}
	}
	

}
