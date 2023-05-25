package winsem;

public class cslabbankdep extends cslabbank
{
	double dep;
	
	cslabbankdep(String name,long accno,long pno,double balance,double dep)
	{
		super(name,accno,pno,balance);
		this.dep = dep;
	}
	
	double calculate()
	{
		balance = balance+dep;
		return balance;
	}
}
