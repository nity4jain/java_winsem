package winsem;

import java.util.*;
public class dietmain 
{
 public static void main(String [] args)
 {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("1. calculate vitamin intake  ");
	 System.out.println("2. calculate protien intake ");
	 System.out.println("3. calculate fat intake ");
	 System.out.println("Enter your choice ");
	 int ch = sc.nextInt();
	 dietchart obj = new dietchart(30,40,60,80);
	 switch(ch)
	 {
	 case(1): 
	 dietchart obj1 = new vitaminintake(30,40,60,80);
	 obj.input();
	 System.out.println();
	 obj1.fitness();
	 break;
	 case(2):
	 dietchart obj2 = new Protienintake(30,40,54,90);
	 obj.input();
	 System.out.println();
	 obj2.fitness();
	 break;
	 case(3):
	 dietchart obj3 = new Fatintake(30,40,60,100);
	 obj.input();
	 System.out.println();
	 obj3.fitness();
	 break;
	 default:
		 System.out.println("Invalid choice ");
		 break;
      }
}
}