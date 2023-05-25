package winsem;

import java.util.*;
public class initials 
{
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter a string");
	 String str = sc.nextLine();
	 String s = " "+str;
	 int i;
	 System.out.println("The initials are");
	 for(i=0;i<s.length();i++)
	 {
		 if(s.charAt(i)==' ')
		 {
			 System.out.print(s.charAt(i+1));
		 }
	 }
 }
}
