package winsem;
import java.util.*;

public class constructorclass 
{
	String name = "Nitya";
	int age = 20;
	 
	 constructorclass(int n, String str)
	 { 
		 name = str;
		 age  = n;
	 }
	 
 public static void main(String [] args)
 {
	 constructorclass obj = new constructorclass(35,"Udit");
	 constructorclass obj2 = new constructorclass(20,"Nitya");
	 System.out.println(obj.name);
	 System.out.println(obj.age);
	 System.out.println(obj2.name);
	 System.out.println(obj2.age);
 }
 
}
