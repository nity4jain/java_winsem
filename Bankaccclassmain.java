package winsem;
import java.util.*;
public class Bankaccclassmain 
{
   public static void main(String [] args)
   {
	   Scanner sc = new Scanner (System.in);
	   Bankaccclass obj = new Bankaccclass();
	   Bankaccclass obj1 = new Bankaccclass();
	   Bankaccclass obj2 = new Bankaccclass();
	   Bankaccclass obj3 = new Bankaccclass();
	   Bankaccclass obj4 = new Bankaccclass();
	   Bankaccclass [] customers = new Bankaccclass[3];
	   int i;
	   customers [0] = obj;
	   customers [1] = obj1;
	   customers [2] = obj2;
	   obj.accountdetails();
	   obj.display();
	   obj.deposit(2000);
	   obj.withdraw(2100);
	   
	   System.out.println();
	   obj1.accountdetails();
	   obj1.display();
	   System.out.println();
	   obj2.accountdetails();
	   obj2.display();
	   
	   System.out.println("Enter account you want to search ");
	   int a = sc.nextInt();
	   
	   for(i=0;i<3;i++)
	   {
	   if(customers[i].search(a)==true)
	   {
		   System.out.println("Account exists ");
		   customers[i].display();
	   }
   }
}
}
