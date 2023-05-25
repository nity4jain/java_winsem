package winsem;

import java.util.*;
public class bankconstructor 
{
	private String aacno;
	 private String name;
	 private String aactype;
	 private long balance;
	 private long ad ;
	 private long aw;
	 Scanner sc = new Scanner(System.in);
	 
	 bankconstructor(long ad,long aw, long balance) 
	 {
		this.ad = ad;
		this.aw = aw;
		this.balance = balance;
		 
	 }

	 bankconstructor(long amount) 
	 {
		ad = amount;
		aw = amount;
		balance = amount;
		 
	 }
	 void input()
	 {
		 System.out.println("Enter the name");
		 name = sc.next();
		 System.out.println("Enter the accno");
		 aacno = sc.next();
		 System.out.println("Enter the account type ");
		 aactype = sc.next();
		 
	 }
	 void showbalance()
	 {
		 System.out.println("The name is "+name);
		 System.out.println("The accno is "+aacno);
		 System.out.println("The acc type is "+aactype);
		 System.out.println("The balance is "+balance);
	 }
	 
	 void deposit()
	 {
		 balance = balance+ad;
		 System.out.println("The balance now is "+balance);
	 }
	 void withdraw()
	 {
		 if(aw<=balance)
		 {
			 balance = balance - aw;
		 }
		 System.out.println("The balance is "+balance);
	 }
	 
	 public static void main(String [] args)
	 
	 {
		 bankconstructor o = new bankconstructor(23456,45678,12344578);
		 bankconstructor p = new bankconstructor(23456);
		 o.input();
		 o.showbalance();
		 o.deposit();
		 
		 p.input();
		 p.showbalance();
		 p.withdraw();
		
		 
	 }
}
