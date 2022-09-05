
package module2;

public class Pr_25 {
	public static void main(String[] args) {
		try
		{
			int[] arr=new int[5];
			int a[]={1,2,3,4,5,7};
			try
			{
				arr[5]=100/0;
				arr[7]=3;
			}
		  
			 catch(ArithmeticException ae)
			   {
			    System.out.println("divide by zero");
			   }
			
			 catch(ArrayIndexOutOfBoundsException e)
			  {
			   System.out.println("array index out of bound exception");
			  }
		
			
		}
			  catch(Exception e)
			  {
			   System.out.println("undefined error");
			  }
		
	}

}
