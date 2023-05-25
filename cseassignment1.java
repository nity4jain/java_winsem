package winsem;

import java.util.*;
public class cseassignment1 
{
   public static void main()
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number of rows");
	   int n = sc.nextInt();
	   System.out.println("Enter the number of columns");
	   int m = sc.nextInt();
	   System.out.println("Enter the elements ");
	   int i,j;
	   int a[][] = new int [n][m]; 
	   for(i=0;i<n;i++)
	   {
		   for(j=0;j<m;j++)
		   {
			   a[i][j]=sc.nextInt();
		   }
	   }
	   System.out.println("The guven elements are ");
	   for(i=0;i<n;i++)
	   {
		   for(j=0;j<m;j++)
		   {
			   System.out.print(a[i][j]+"\t");
		   }
		   System.out.println();
	   }
	   int sum = 0;
	   for(i=0;i<n;i++)
	   {
		   for(j=0;j<m;j++)
		   {
			   if(i!=j||(i+j)!=(m-1))
			   {
				sum = sum + a[i][j];   
			   }
		   }
	   }
	   System.out.println("The sum of all the elements except diagonal elements are"+sum);
   }
   
}
