package winsem;

import java.util.*;

public class deletion
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter the number of elements ");
		int a = sc.nextInt();
		int b[]= new int[a];
		System.out.println("Enter the elements ");
		int i;
		int c[] = new int [a-1];
		for(i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Given elements are");
		for(i=0;i<a;i++)
		{
			System.out.print(b[i]+"\t");
		}
			if((b[i]+b[i+1])<=b[i+2])
			{
				for(int j =0;j<=i+2;j++)
					c[j]=b[j];
			}
		}
		System.out.println("Now the elements are ");
		for(i=0;i<a-1;i++)
		{
			System.out.println(c[i]);
		}
	}
}
