package winsem;

import java.util.*;
public class deletionlogic
{
 public static void main()
 {
	 Scanner sc = new Scanner(System.in);
	 int a [] = new int[4];
	 int b [] = new int [3];
	 int i;
	 System.out.println("Enter the elements ");
	 for (i=0;i<4;i++)
	 {
		a[i] = sc.nextInt();
	 }
	 
	 int index = 2;
	 if(a[1]+a[0]<=a[2])
	 {
  for(i=0;i<index;i++)
  {
	  b[i]=a[i];
  }
  for(i = index+1;i< 5 ;i++)
  {
	  b[i-1]=a[i];
  }
  for(i=0;i<b.length;i++)
  {
	  System.out.println(b[i]);
  }
	 }
	 
  else
  {
	  int i = 0;
	  while(i<4)
	  {
		  System.out.println(a[i]);
		  i=i+1;
	  }
  }
	
}
}
