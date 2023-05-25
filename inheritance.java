package winsem;

public class inheritance 
{
	 int a = 50;
	 void show()
	 {
		 System.out.println("Parent class");
		 System.out.println(a);
	 }
}
	 class B 
	 {
		 int a = 60;
		 void show()
		 {
			 //super.show();
			 //System.out.println("Child class");
			 System.out.println(a);
		 }
	 }
	 
	 class C extends inheritance,B
	 
	 {
		 int c = 30;
		 void get() 
		 {
			 System.out.println(c);
		 }
	 }
