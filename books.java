package winsem;
import java.util.*;
public class books 
{
  public static void main(String [] args)
  {
	  ArrayList<String> books = new ArrayList<String>();
	  books.add("Jane Eyre");
	  books.add("How to kill a mocking bird");
	  books.add("Brave a new World");
	  books.add("Harry Potter");
	  books.add("Call of the forest");
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the  name of the book you want to find");
	  String name = sc.nextLine();
	  boolean found=false;
	  
	  Iterator itr = books.iterator();
	  while(itr.hasNext())
	  {
		  if(name.equals(itr))
		  found = true;
		  break;
			  
	  }
	  
	  if(found==false)
	  {
		  try
		  {
			  throw new BookNotFoundException("Book Not Found");
		  }
	 catch(BookNotFoundException e)
		{
			 System.out.println(e.getMessage());
		}
		  
  }
 }
}
