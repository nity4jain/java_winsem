package winsem;
import java.util.*;
public class averagetest 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
	    int i;
		  System.out.println("Enter the size of the int array");
		  int n = sc.nextInt();
		  int a[] = new int [n];
		  System.out.println("Enter the elements");
		  for(i=0;i<n;i++)
		  {
			  a[i]=sc.nextInt();
		  }
		  double intavg = ArithmeticAverage.average(a);
			  System.out.println("Enter the size of the double array");
			  int m = sc.nextInt();
			  double b[] = new double [m];
			  System.out.println("Enter the elements");
			  for(i=0;i<m;i++)
			  {
				  b[i]=sc.nextDouble();
		      }
	 double doubleavg = ArithmeticAverage.average(b);
	 System.out.println("int "+intavg);
	 System.out.println("double "+doubleavg);
	 }
  }
