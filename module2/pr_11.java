package module2;

class member
{
	String name;
	int age;
	String phone_no;
	int salary;
	String address;
	String specialization;
	
	public void setsalary()
	{
		salary=12000;
	}
	public void printSalary()
	{
		System.out.println("member salary is"+salary);
	}
}
class employee extends member
{
	String specialization;
	public void setdataemp()
	{
		name="payal";
		age=12;
		phone_no="9653750240";
		address="ahemdabad";
		specialization="typing";

	}
	public void showemp()
	{
		System.out.println("employee name is.."+name);
		System.out.println("employee age is.."+age);
		System.out.println("employee phone number is.."+phone_no);
		System.out.println("employee address is.."+address);
		System.out.println("employee specialization is.."+specialization);
	  
	}

}

class manager extends member
{
	String department;
	public void setDataman()
	{
		name="srushti";
		age=13;
		phone_no="9653750240";
		address="surat";
		department="finance";

	}
	public void showman()
	{
		System.out.println("manager name is.."+name);
		System.out.println("manager age is.."+age);
		System.out.println("manager phone number is.."+phone_no);
		System.out.println("manager address is.."+address);
		System.out.println("manager department is.."+department);
		  System.out.println();
	
	}

	
}

public class pr_11 {
	public static void main(String[] args) {
		manager m1=new manager();
		m1.setsalary();
		m1.printSalary(); 
		m1.setDataman();
		m1.showman();
		
		employee e1=new employee();
		e1.setdataemp();
		e1.showemp();
		
		
	}

}
