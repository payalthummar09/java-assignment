/* W.A.J.P to create a class Student with attributes roll no, name, age and 
course. Initialize values through parameterized constructor. If age of 
student is not in between 15 and 21 then generate user defined exception 
"AgeNotWithinRangeException". If name contains numbers or special 
symbols raise exception "NameNotValidException". Define the two 
exception classes*/

package module2;

import java.util.Scanner;

class AgeNotWithinRangeException extends Exception
{
	public AgeNotWithinRangeException()
	{
		System.out.println("AgeNotWithinRangeException");
	}
}
class NameNotValidException extends Exception
{
	public NameNotValidException()
	{
		System.out.println("NameNotValidException");
	}
}
class Student
{
	int Roll_no,age;
	String sname;
	
	public Student(int rno,String name,int ag)
	{
		Roll_no=rno;
		sname=name;
		age=ag;
	}
	public void check() throws  NameNotValidException
	{
		
		System.out.println("roll no is.."+Roll_no);
		for(int i=0;i<sname.length();i++)
		{
			
		
				if(!Character.isLetter(sname.charAt(i)))
				{
					throw new NameNotValidException();
				}
//				else
//				{
//					System.out.println("name is.."+sname);
//				}
		}
		System.out.println("name is : "+sname);
		
		
		
		
	}
	public void check1() throws AgeNotWithinRangeException
	{
		if(!(age>15 && age<21))
		{
			throw new AgeNotWithinRangeException();
		}
		else
		{
			System.out.println("age is.."+age);
		}
	}
}

public class Pr_30 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entre roll no..");
		int rno=sc.nextInt();
		System.out.println("entre name..");
		String name=sc.next();
		System.out.println("entre age..");
		int ag=sc.nextInt();
		
		Student s=new Student(rno,name,ag);
		try {
			s.check();
		} 
		
		catch (NameNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			s.check1();
		} catch (AgeNotWithinRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
