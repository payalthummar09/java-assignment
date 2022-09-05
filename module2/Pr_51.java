/* Write a Java program to count the number of key-value (size) mappings 
in a map.*/

package module2;

import java.util.HashMap;

public class Pr_51 {
	public static void main(String[] args) {
		HashMap h1=new HashMap();
		h1.put(1,"a");
		h1.put(2,"b");
		h1.put(3,"c");
		h1.put(4,"d");
		System.out.println(h1);
		System.out.println("size of hashmap is.."+h1.size());
	}

}
