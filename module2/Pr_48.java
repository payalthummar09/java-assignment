package module2;

import java.util.HashSet;
import java.util.Iterator;

public class Pr_48 {
	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add("a");
		h1.add("b");
		h1.add("c");
		h1.add('d');
		System.out.println(h1);
		Iterator p= h1.iterator();
		  // Iterate the hash set
		   while (p.hasNext()) {
			   System.out.println(p.next());
		   }
	}

}
