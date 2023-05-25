package winsem;

public class BankAccMain 
{
  public static void main(String [] args)
  {
	  loanAccount obj = new loanAccount(12345,"nitya",36348531,8840311,200000,20000);
	  obj.display_balance();
	  obj.deposit();
	  System.out.println("Now");
	  obj.display_balance();
  }
}
