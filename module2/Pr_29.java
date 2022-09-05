

package module2;

import java.util.Scanner;
class error extends Exception
{
	double am;
	public error(double need)
	{
		this.am=need;
		//System.out.println("sorry, insufficient balance, you need more "+need+" Rs. To perform this transaction.");
	}
}
class atm
{
	public void withdraw(double amount,double balance) throws error
	{
	if(balance>amount)
	{
		balance=balance-amount;
		System.out.println("your available balance is."+balance);
	}
	else
	{
		double need=amount-balance;
		throw new error(need);
	}
	}
	
}
public class Pr_29 {
	public static void main(String[] args) {
		double balance=2000;
		Scanner sc=new Scanner(System.in);
		System.out.println("entre amount you want to withdraw..");
		double amount=sc.nextInt();
	   
		try
		{
			 atm a=new atm();
			    
		a.withdraw(amount, balance);
		}
		catch(error e)
		{
			System.out.println("sorry, insufficient balance, you need more "+e.am+" Rs. To perform this transaction.");
		}
	}

}
