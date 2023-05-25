package winsem;
import java.util.*;
public class Bankaccclass
{
	Scanner sc = new Scanner (System.in);
	private String customer;
	private String account_type;
	private int account_number;
    private	double balance;
	
	void accountdetails()
	{
		System.out.println("Enter customer name ");
		customer = sc.nextLine();
		System.out.println("Enter account type ");
		account_type = sc.nextLine();
		System.out.println("Enter account number ");
		account_number = sc.nextInt();
		System.out.println("Enter balance ");
		balance = sc.nextDouble();
	}
	void deposit (double deposit)
	{
		balance = balance+deposit;
		System.out.println("Deposited amount is "+deposit );
		System.out.println("Balance is "+balance);
	}
	
	void withdraw(double withdraw)
	{
		balance = balance-withdraw;
		System.out.println("Deposited amount is "+withdraw);
		System.out.println("Balance is "+balance);
	}
	
	boolean search(int a)
	{
		if(a==account_number)
		return true;
		else
			return false;
	}
	
	void display()
	{
		System.out.println("Name is "+customer);
		System.out.println("account name is "+ account_number);
		System.out.println("account type is "+ account_type);
        System.out.println("Original balance is "+ balance);
	}
	
}
