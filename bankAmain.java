package winsem;

public class bankAmain 
{
	public static void main(String [] args)
	{
   Savings obj = new Savings("Ankita",12345,"34/78",200000,2500);
   double a = obj.invest();
   obj.withdraw();
  double b = obj.calcAmt();
  System.out.println("Amount after one year "+b);
  System.out.println("return on investment "+a);
}
}
