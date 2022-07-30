package module2;
abstract class parent1
{
	public abstract  void message();
	 
		 
	 
}
 class subclass1 extends parent1
{

	@Override
	public void message() {
			System.out.println("this is first subclass..");
		
	}
  
	
}
 class subclass2 extends parent1
 {

	@Override
	public void message() {
		System.out.println("this is second subclass..");
		
	}
	 
 }

public class pr_15 {
	public static void main(String[] args) {
		subclass1 s1=new subclass1();
		s1.message();
		subclass2 s2=new subclass2();
		s2.message();
	}
	
	
	

}
