package winsem;

public class cselab2
{
  String name;
  int age,rno;
  cselab2()
  {
	  name ="";
	  age = 0;
	  rno=0;
  }
  cselab2(String a1,int d1, int t1)
  {
	  		name =a1;
	  		age =d1;
	  		rno=t1;
  }
  
  void printdata()
{
  System.out.println("Name is "+name);
  System.out.println("Age is "+age);
  System.out.println("Roll number is "+rno);
  System.out.println();
}
  
  public static void main(String [] args)
  {
	  cselab2 obj = new cselab2();
	  obj.printdata();
	  cselab2 obj2 = new cselab2("nitya",20,8);
	  obj2.printdata();
  }
}
  
