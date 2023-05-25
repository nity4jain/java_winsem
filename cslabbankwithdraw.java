package winsem;

public class cslabbankwithdraw extends cslabbankdep
{
	double withdraw;
	cslabbankwithdraw(String name,long accno,long pno,double balance,double dep,double withdraw)
	{
		super(name,accno,pno,balance,balance);
		this.withdraw = withdraw;
	}
	
	double calculate()
	{
		balance = balance - withdraw;
		return balance;
	}
}

