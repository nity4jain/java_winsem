package winsem;
import java.util.*;
public class gcd 
{
  public static void main(String [] args )
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the first and second number ");
	  
	  int a ,b,gcd;
	  a = sc.nextInt();
	  b = sc.nextInt();
	  gcd = findgcd(a,b);
	  System.out.println(gcd);
  }
  
  public static int findgcd(int a, int b)
  {
	 int i;
	 int l,s;
	 int gcd=1;
	 if(a<b)
	 {
      l = b;
      s = a;
	 }
     else
     {
      s = b;
      l=a;
     }
	 while(s<l)
	 {
		 if(l%s==0)
			 gcd=s;
	     else
	     {
	    	 int t = s;
	    	 s = l%s;
	    	 l = s;
	     }
	 }
	 return gcd;
  }
}

