package winsem;
import java.util.*;
public class happymethod
{
	 public static void main(String [] args)
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number ");
	 int n = sc.nextInt();
	 boolean a = happy(n);

	if(a==true)
	{
	System.out.println("Happy number ");
	}
	else
	{
	System.out.println("Not happpy number");
	}
	}

	public static boolean happy(int b)
	{
	 int t;
	 int s = 0;
	 t = b;
	 while(t>9)
	{
		 s =0;
	 while(t>0)
	{
	  int  d = t%10;
	  s = s+(d*d);
	  t = t/10;
	}
	t = s;
	}

	if(s==1|| s==7)
	  return true;
	else
	  return false;
	}
	}

