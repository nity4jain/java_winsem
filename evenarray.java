package winsem;

public class evenarray 
{
  public static void main(String [] args )
  {
	  int i;
	  int a [] = {1,4,6,3,2,9,11,12,20,10};
	  int sum = 0;
	  
	  for(i = 0;i<a.length;i++)
	  {
		  if(a[i]%2 == 0)
			  sum+=a[i];
	  }
	  System.out.println("The sum of the even numbers in the given array is "+sum);
	  
  }
}
