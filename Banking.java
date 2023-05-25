package winsem;

import java.util.*;
public class Banking 
{
 private String aacno;
 private String name;
 private String aactype;
 private long balance;
 Scanner sc = new Scanner(System.in);
 
 void input()
 {
	 System.out.println("Enter the name");
	 name = sc.next();
	 System.out.println("Enter the accno");
	 aacno = sc.next();
	 System.out.println("Enter the account type ");
	 aactype = sc.next();
	 System.out.println("Enter the balance");
	 balance = sc.nextLong();
	 
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
	 System.out.println("Enter the amount to be deposited ");
	 long a = sc.nextLong();
	 balance = balance+a;
	 System.out.println("The balance now is "+balance);
 }
 void withdraw()
 {
	 long a;
	 System.out.println("Enter the amount to be withdrawn");
	 a = sc.nextLong();
	 if(a<=balance)
	 {
		 balance = balance - a;
	 }
	 System.out.println("The balance is "+balance);
 }
 /* ARRAY OF OBJECTS
  * bankdetails []c = new bankdetails[
  * ]
 */
 
}
