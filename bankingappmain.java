package winsem;

import java.util.*;
public class bankingappmain 
{
  public static void main(String [] args )
  {
	  Scanner sc = new Scanner(System.in);
	  bankingapp obj = new bankingapp();
	  System.out.println("Menu");
	  System.out.println("1. input the information");
	  System.out.println("2. Display all the information");
	  System.out.println("3. To deposit");
	  System.out.println("4. To withdraw");
	  System.out.println("5. Exit");
	  
	  int ch =1;
	  int n=1;
	  
	  do
	  {
	  System.out.println("Enter your choice ");
	  ch = sc.nextInt();
	  
	  switch(ch)
	  {
	  case(1):
		  System.out.println("Enter the number of customer details to be entered ");
	      n = sc.nextInt();
	      for(int i=1;i<=n;i++)
	      {
	    	  obj.input();
	      }
	      break;
	  case(2):
		  for(int i=1;i<=n;i++)
		  {
			 obj.showbalance(); 
		  }
		  obj.showbalance();
	  break;
	  case (3):
		  obj.deposit();
	  break;
	  case (4):
		  obj.withdraw();
	  break;
	  case (5):
		  System.out.println("Thanks for using the application ");
	  break;
	  default:
		  System.out.println("Wrong choice");
		  break;
	  }
  }while(ch!=5);
}
}
