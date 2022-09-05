package module2;

import java.util.ArrayList;
import java.util.Iterator;

public class Pr_38 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		System.out.println("array list is..");
		a1.add("red");
		a1.add("orange");
		a1.add("white");
		a1.add("black");
		a1.add("blue");
		System.out.println(a1);
		
		Iterator i1= a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

		}
	}

