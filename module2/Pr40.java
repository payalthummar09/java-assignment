package module2;

import java.util.ArrayList;

public class Pr40 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		System.out.println("array list is..");
		a1.add("red");
		a1.add("orange");
		a1.add("white");
		a1.add("black");
		a1.add("blue");
		System.out.println(a1);
		System.out.println("The element at index 3 in the ArrayList is: " + a1.get(3));
	}

}
