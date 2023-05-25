package winsem;
import java.util.*;
public class ArithmeticAverage 
{
  Scanner sc = new Scanner (System.in);
	 public static double average(int a[])
		{
			double avg;
			int sum = 0;
			for(int i=0;i<a.length;i++)
			{
			 sum +=a[i];	
			}
			avg = sum/(a.length-1);
			return avg;
		}
	 public static double average(double b[])
		{
			int sum = 0;
			for(int i=0;i<b.length;i++)
			{
			 sum +=b[i];	
			}
			return sum/(b.length-1);
			
		}
  
}
