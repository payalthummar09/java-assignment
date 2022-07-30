package module2;
 class Shape21
{
	 public void print()
	{
		System.out.println("this is shape...");
	}
   
}
class  rectangle21 extends Shape21
{

	
	public void print1() {
		System.out.println("this is rectangle shape..");
		
	}
	
}
class circle extends Shape21
{

	
	public void print2() {
		System.out.println("this is circle shape...");
		
	}
	
}
class square extends rectangle21
{
	public void print3()
	{
		System.out.println("square is rectangle..");
	}
	
}

public class pr_21 {
	public static void main(String[] args) {
		square sq=new square();
		sq.print1();
		sq.print();
	
		
	}

}
