package winsem;

public class CheckingAccount extends BankAccount
{
	CheckingAccount(double balance)
	{
		super(balance);
	}
	
  public double withdraw(double amount)
  {
	  balance = balance - amount;
	  return balance;
  }
}
