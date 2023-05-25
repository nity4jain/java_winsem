package winsem;

import java.util.*;
public class multiply 
{
  public static void main(String [] args)
  {
	  Scanner sc = new Scanner (System.in);
	  System.out.println("Enter row and column ");
	  int m = sc.nextInt();
	  int n = sc.nextInt();
	  int p = sc.nextInt();
	  int a [][] = new int [m][n];
	  int b [][]=new int [n][p];
	  int c [][]=new int [m][p];
	  int i,j,k;
	  System.out.println("Enter the values for first matrix");
	  for(i = 0;i<m;i++)
	  {
		  for(j=0;j<n;j++)
		  {
			  a[i][j]=sc.nextInt();
		  }
	  }
	  System.out.println("Enter the values for second matrix");
	  for(i = 0;i<n;i++)
	  {
		  for(j=0;j<p;j++)
		  {
			  b[i][j]=sc.nextInt();
		  }
	  }
		
	  for(i=0;i<m;i++)
	  {
		  for(j=0;j<p;j++)
		  {
			  for(k=0;k<n;k++)
			  {
				c[i][j]+=a[i][k]*b[k][j];  
				
				
			  }
		  }
	  }
	  System.out.println("Multiplication ");
	  
	  for(i=0;i<m;i++)
	  {
		  for(j=0;j<p;j++)
		  {
			  System.out.print(c[i][j]+"\t");
		  }
		  System.out.println();
	  }
  }
}
