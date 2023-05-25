package winsem;
// 
public class cselab1 
{
	int a;
	int b;
	int sum;
  cselab1()
  {
	  a=23;
	  b=32;
	  sum=0;
  }
  
  cselab1(int a1,int b1,int c1)
  {
	  a=a1;
	  b=b1;
	  sum=c1;
  }
  
  public int sum(int a,int b)
  {
	  sum = a+b;
	  return sum;
  }
  public void display()
  {
	  System.out.println("The sum is "+sum);
  }
  
public static void main(String [] args)
{
cselab1 obj = new cselab1();
cselab1 obj2 = new cselab1(89,98,0);
obj.sum(23,32);
obj2.sum(89,97);
obj.display();
obj2.display();

}
}
