package winsem;
import java.util.*;
public class negarray 
{
  public static void main(String [] args)
  {
	  Scanner sc = new Scanner (System.in);
	  try
	  {
	  System.out.println("Enter the length ");
	  int n = sc.nextInt();
	  if (n<0)
	  {
		  throw new invalidArrayLengthException("length cannot be negative");
	  }
	  }
	  catch(invalidArrayLengthException e)
	  {
		  System.out.println(e.getMessage());
		  
	  }
}
}
