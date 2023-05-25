package winsem;
import java.lang.Math;
import java.util.*;
public class absolute 
{
 public static void main(String [] args)
 { 
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter a number");
	 int n = sc.nextInt();
	 int d; int sum =0;
	 int num;
	 if(n<0)
	 {
		 num = Math.abs(n);
	 }
	 else
		 num = n;
	 
	 
	 while(num>0)
	 {
		 d = num%10;
		 sum = sum+d;
		 num = num/10;
	 }
	 System.out.println("The sum of the given number is "+sum);
 }
}
