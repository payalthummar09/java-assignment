package module2;
abstract class marks
{
	abstract public void getPercentage();
	
}
class StudentA extends marks
{
	int sub1,sub2,sub3,total,per;
	public StudentA(int a,int b,int c)
	{
	
		 sub1=a;
		 sub2=b;
		 sub3=c;
			}
	@Override
	public void getPercentage() {
		 total=sub1+sub2+sub3;
		 per=(total*100)/300;

		 System.out.println("studentA percentage is.. "+per);
		
	}
	
}
class StudentB extends marks
{
	int sub1,sub2,sub3,sub4,total,per;
	public StudentB(int a,int b,int c,int d)
	{
	
		 sub1=a;
		 sub2=b;
		 sub3=c;
			}
	@Override
	public void getPercentage() {
		 total=sub1+sub2+sub3+sub4;
		 per=(total*100)/400;

		 System.out.println("studentB percentage is.. "+per);
		
	}
	
}

public class pr_17 {
	public static void main(String[] args) {
		StudentA sA=new StudentA(50,60, 70);
		sA.getPercentage();
		StudentB sB=new StudentB(50,40,30,80);
		sB.getPercentage();
		
	}

}
