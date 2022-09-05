package module2;

import java.util.ArrayList;
import java.util.Collections;

public class Pr_55 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	
	System.out.println("array list is..");
	a1.add("red");
	a1.add("orange");
	a1.add("white");
	a1.add("black");
	a1.add("blue");
	System.out.println("before swaping list is..."+a1);
	Collections.swap(a1, 1, 2);
	System.out.println("after swaping list is..."+a1);
}
}
