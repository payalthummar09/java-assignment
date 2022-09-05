//Write a Java program to increase the size of an array list
package module2;

import java.util.ArrayList;

public class Pr_60 {
	public static void main(String[] args) {
		ArrayList arr=new ArrayList(3);
		arr.add("red");
		arr.add("black");
		arr.add("blue");
		System.out.println("origibnal list is.."+arr);
		arr.ensureCapacity(6);
		arr.add("white");
		arr.add("pink");
		arr.add("green");
		System.out.println("new list is.."+arr);
		
	}

}
