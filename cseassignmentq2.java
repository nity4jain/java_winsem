package winsem;

import java.util.*;
public class cseassignmentq2 
{
 public static void main(String [] args )
 {
	 int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice ");
		choice = sc.nextInt();
		switch(choice)
		{
		case(1):
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int temp;
		int sum = 0;
		int d;
		temp = n;
		while(temp>0)
		{
			d = temp%10;
			sum = sum*10+d;
			temp=temp/10;
		}
		if(sum == n)
		{
			System.out.println("Number is palindrome");
			
		}
		else
		{
			System.out.println("Number is not palindrome ");
		}
		break;
		case(2):
	    System.out.println("Enter any number ");
		int num = sc.nextInt();
		int t = num;
	    int d1 =0;
        int s=0;
		while(t>=9)
		{
			s=0;
			while(t>0)
			{
				d1 = t%10;
				s = s+(d1*d1);
				t = t/10;
			}
			t = s;
		}
		if(s==1||s==7)
			System.out.println("Happy Number");
		else
			System.out.println("Not a Happy Number ");
		    
 break;
		
		default:
			System.out.println("Invalid choice ");
			break;
       }
}
}
