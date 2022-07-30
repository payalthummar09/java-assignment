package module2;

import java.util.Scanner;

public class pr_3 {
	public static void main(String[] args) {
		String str1="topsint.com",str2="Topsint.com";
	    CharSequence cs="topsint.com";
	    System.out.println(" comparing "+str1+" and "+cs+" :"+str1.contentEquals(cs));
	    System.out.println(" comparing "+str2+" and "+cs+" :"+str2.contentEquals(cs));
	}

}
