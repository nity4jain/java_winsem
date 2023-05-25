package winsem;

public class cslabbank 
{
  String name;
  long accno;
  long pno;
  double balance;
  
  public cslabbank(String name,long accno,long pno,double balance)
  {
	  this.name = name;
	  this.accno = accno;
	  this.pno = pno;
	  this.balance = balance;
  }
  
  void display()
  {
	  System.out.println("Name "+ name);
	  System.out.println("acc no is "+ accno);
	  System.out.println("phone no is "+ pno);
	  System.out.println("balance is "+ balance);
  }
}






