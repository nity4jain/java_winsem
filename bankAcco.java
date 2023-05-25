package winsem;

import java.util.*;
public class bankAcco 
{
  String name;
  long account_number;
  String address;
  double balance;
  Scanner sc = new Scanner(System.in);
  bankAcco(String name,long account_number,String address,double balance)
  {
	  this.name = name;
	  this.account_number = account_number;
	  this.address = address;
	  this.balance = balance;
  }
  double withdraw()
   {
	   System.out.println("Enter amount to withdraw ");
	   double withdraw = sc.nextDouble();
	   balance -= withdraw;
	   return balance;
   }
		   
  
  
  void display()
  {
	  System.out.println("The balance is "+balance);
  }
  
}
