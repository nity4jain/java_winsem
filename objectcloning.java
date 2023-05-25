package winsem;
import java.util.*;
public class objectcloning implements Cloneable 
{
   int id;
   String name;
   
   public objectcloning(int id, String name)
   {
	   this.id = id;
	   this.name = name;
   }
   
   public void display()
   {
	   System.out.println("id : "+id);
	   System.out.println("name is : "+name);
   }
   /*
   public static void main(String [] args)throws CloneNotSupportedException // deep cloning example
	{
		objectcloning obj = new objectcloning(101,"nitya");
		obj.display();
		objectcloning obj1 = (objectcloning)obj.clone();
		obj1.name = "khushi";
		obj1.id = 102;
		obj1.display();
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}
   */
   public static void main(String [] args ) throws CloneNotSupportedException // shallow cloning example
   {
	   objectcloning obj =  new objectcloning(101,"nitya");
	   obj.display();
	   objectcloning obj1 = obj;
	   System.out.println("Print true if shallow copy");
	   System.out.println(obj==obj1);
	   System.out.println(obj.hashCode());
	   System.out.println(obj1.hashCode());
   }
}
