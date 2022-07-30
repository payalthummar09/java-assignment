package module2;

class area
{
	public void find(int r)
	{
		System.out.println("the area of square is.. "+(r*r));
		
	}
	public void find(int l,int b)
	{
		System.out.println("the area of reactangle is.. "+(l*b));
	}
	
}

public class pr_9 {
	public static void main(String[] args) {
		area a1=new area();
		a1.find(12);
		a1.find(12, 13);
		
		
	}

}
