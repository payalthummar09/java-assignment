package module2;
class parent
{
	public void show()
	{
		System.out.println("this is parent class..");
	}
}
class child extends parent
{
	public void print()
	{
		System.out.println("this is child class..");
	}
	
}

public class pr_10 {
	public static void main(String[] args) {
		parent p1=new parent();
		p1.show();
		child c1=new child();
		c1.print();
		c1.show();
	}

}
