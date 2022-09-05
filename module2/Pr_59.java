//Write a Java program to check whether a map contains key-value 
//mappings (empty) or not
package module2;

import java.util.HashMap;

public class Pr_59 {
	public static void main(String[] args) {
		HashMap h1=new HashMap();
		h1.put(1,"red");
		h1.put(2,"orange");
		h1.put(3,"white");
		boolean result=h1.isEmpty();
		System.out.println("is hash map empty:"+result);
		h1.clear();
		result=h1.isEmpty();
		System.out.println("is hash map empty:"+result);
		
		
	}

}
