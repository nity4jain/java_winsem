package winsem;

public class Amazonmain 
{
  public static void main(String [] args)
  {
	  Price obj = new Price("xyz",2300,2,3);
	  double c =obj.calculate_price();
	  obj.print();
	  System.out.println("The amount is "+c);
  }
}
