package module2;
class triangle
{
	int a=3;
	int b=4;
	int c=5;
	
	
	public triangle()
	{
		double s=(a+b+c)/2;
		double area=Math.sqrt (s*(s-a)*(s-b)*(s-c));
		System.out.println("area of triangle is.. "+area);
		int peri=a+b+c;
		System.out.println("perimeter is.. "+peri);
	}
//	public void area()
//	{
//		int area=0.5*a*b*c;
//		System.out.println("area of triangle is.. "+area);
//	}
//	public void perimeter()
//	{
//		int peri=a+b+c;
//		System.out.println("perimeter is.. "+pari);
//	}
}

public class pr_13 {
	public static void main(String[] args) {
		triangle t1=new triangle();
//		t1.area();
//		t1.perimeter();
		
	}

}
