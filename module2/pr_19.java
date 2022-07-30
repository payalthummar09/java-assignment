package module2;
 abstract class Shape
{
	 abstract public void RectangleArea(int lenth,int breadth);
	 abstract public void SquareArea(int side);
	 abstract public void CircleArea(int redius);
	 
	
}
 class Area extends Shape
 {

	@Override
	public void RectangleArea(int lenth,int breadth) {
		int areaReact;
		areaReact=lenth*breadth;
		System.out.println("area of Reactangle is:.."+areaReact);
		
		
	}

	@Override
	public void SquareArea(int side) {
		int areaSquare=side*side;
		System.out.println("area of square is:."+areaSquare);
		
	}

	@Override
	public void CircleArea(int redius) {
		double areaCircle=3.14*redius*redius;
		System.out.println("area of circle is:."+areaCircle);
		
	}
	 
 }

public class pr_19 {
	public static void main(String[] args) {
		Area a1=new Area();
		a1.RectangleArea(15,4);
		a1.SquareArea(120);
		a1.CircleArea(6);
		
		
	}

}
