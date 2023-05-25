package winsem;

public class BankAccountMain 
{
  public static void main(String [] args)
  {
	  SavingsAccount obj = new SavingsAccount(123978);
	  double a = obj.deposit(9800);
	  CheckingAccount obj1 = new CheckingAccount(9846263);
	  double b = obj1.withdraw(9846263);
	  System.out.println(a);
	  System.out.println(b);
	  
  }
}
