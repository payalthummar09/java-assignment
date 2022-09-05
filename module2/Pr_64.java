//Write a Java program to get a collection view of the values contained in 
//this map.
package module2;

import java.util.HashMap;

public class Pr_64 {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(1, "red");
		h.put(2, "white");
		h.put(3, "black");
		h.put(4, "green");
		h.put(5, "purple");
		System.out.println("original hashmap is.."+h);
		System.out.println("collection view of hashmap is.."+h.values());
	}

}
