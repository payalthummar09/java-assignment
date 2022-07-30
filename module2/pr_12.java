package module2;
class rectangle 
{
	int length,breadth;
	public rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
	public void areaOfRectangle()
	{
//		int perimeter=2(length+breadth);
		System.out.println("area of reactangle is.. "+(length*breadth));
		
	}
	public void perimetreOfrectangle()
	{
		System.out.println("perimeter of reactangle is.."+(2*(length+breadth)));
		
	}
}
class Sqare extends rectangle
{

	public Sqare(int s) {
		super(s, s);
	
	}
	
}

public class pr_12 {
	public static void main(String[] args) {
		rectangle r1=new rectangle(4,5);
		
		r1.areaOfRectangle();
		r1.perimetreOfrectangle();
		
		Sqare s1=new Sqare(5);
		s1.areaOfRectangle();
		s1.perimetreOfrectangle();
				
		
	}

}
