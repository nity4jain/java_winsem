package winsem;
import java.util.*;
public class Bill 
{
	
	public static void main(String[] args)
	{
	  Product1 obj1 = new Product1("2345","xyz",40000);
	  Product1 obj2 = new Product1("3547","abc",900000);
	  Product1 obj3 = new Product1("756357","amn",20);
	  ArrayList<Product1> itemsList = new ArrayList<Product1>();
	  itemsList.add(obj1);
	  itemsList.add(obj2);
	  itemsList.add(obj3);
		
	}
	 public static void billAmount(ArrayList<Product1> itemsList)
	  {
	  float sum=0.0f;
      for(Product1 p:itemsList)
      {
    	sum+=p.getprice();
      }
    System.out.println(sum);
}
}
