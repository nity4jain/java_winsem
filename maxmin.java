package winsem;

import java.util.*;

public class maxmin 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter number of elements");
	int a =sc.nextInt();
	int b[] = new int[a];
	int i;
	for (i=0;i<a;i++)
	{
		b[i]=sc.nextInt();
	}
	
	System.out.println("The given elements are ");
	for(i=0;i<a;i++)
	{
		System.out.println(b[i]);
	}
	int max = b[0]; int min= b[b.length-1];
	for(i=0;i<b.length;i++)
	
}
}
