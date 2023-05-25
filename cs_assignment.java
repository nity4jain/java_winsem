package winsem;

import java.util.*;
public class cs_assignment
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
	

}
}
