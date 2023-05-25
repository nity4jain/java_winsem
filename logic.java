package winsem;

import java.util.*;
public class logic 
	{
	  public static void main(String[] args)
	  {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice ");
		choice = sc.nextInt();
		switch(choice)
		{
		case(1):
			System.out.println("Pattern 1");
		     for(int i = 1;i<=5;i++)
		     {
		    	 for(int j = 1;j<=i;j++)
		    	 {
		    		 System.out.print("*");
		    		 
		    	 }
		    	 System.out.println();
		     }
		     break;
		case (2):
			System.out.println("Pattern 2");
			for(int i = 5;i>=1;i--)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
					
				}
				System.out.println();
			}
		     break;
		case(3):
			int i, j;
			System.out.println("Pattern 3");
		    for(i=1;i<=7;i++)
		    {
		    	int c =0;
		    	for(j = 1;j<i;j++)
		    	{
		    		if(i%j==0)
		    		{
		    			c++;
		    		}
		    	}
		    	if(c==1)
		    	{
		    	 for(int n =1;n<=i;n++)
		    	 {
		  			System.out.print("*");
		    	 }
		    	System.out.println();
		    		
		    	}
		    }
		    break;
		default:
			  System.out.println("Invalid choice");
			  break;
		}
	  }
	}

