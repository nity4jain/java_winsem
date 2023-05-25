package winsem;

public class Calcmain 
{
  public static void main(String [] args)
  {
	  Calculator obj = new Calculator();
			  int sum = obj.addition(23,78);
			  System.out.println("The additon of two numbers is "+sum);
			  int sum1 = obj.addition(345,90,78);
			  System.out.println("The additon if three nos "+sum1);
			  double sum2 = obj.addition(123.67,89.09,67);
			  System.out.println("The addition of three decimal numbers is "+sum2);
			  
  }
}