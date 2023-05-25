package winsem;
import java.util.*;
public class Fibonacci 
{
  public static void main(String [] args)
  {
	  Scanner sc = new Scanner (System.in);
	  System.out.println("Enter the number of terms ");
	  int N = sc.nextInt();
	  int fst,sec;
	  int sum = 0;
      int i = 1;
      fst = 0; sec = 1;
      System.out.print(fst+"\t");
      System.out.print(sec+"\t");
      while(i<=N)
      {
    	  sum = fst + sec;
    	  int t = sum;
    	  fst = sec;
    	  sec = t;
    	  System.out.print(sum+"\t");
    	  i++;
      }
  }
}
