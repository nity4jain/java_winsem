package winsem;
import java.util.*;
public class Indian_Satellites 
{
	  public  ArrayList<String> Satellite_Names = new ArrayList<String>();
	  
	  public void Satellite_Names()
	  {
	   Satellite_Names.add("Aryabhatta");
	   Satellite_Names.add("Bhaskara-Sega-1");
	   Satellite_Names.add("Rohini RS-1");
	   Satellite_Names.add("IRS-1 A");
	   Satellite_Names.add("Cartosat-2C");
	   Satellite_Names.add("RISAT-2B");
	   Satellite_Names.add("EOS-01");
	   
	  }
	 public void remove_non_operational()
	 {
	   Satellite_Names.remove("Aryabhatta");
	   Satellite_Names.remove("Bhaskara-Sega-1");
	   Satellite_Names.remove("Rohini RS-1");
	   Satellite_Names.remove("IRS-1 A");
   }
	 
	 public void display_sat()
	 {
		 Iterator itr = Satellite_Names.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
	 }
   
   public void update_list()
   {
	   Satellite_Names.add(4,"Cartosat-2F");
	   Satellite_Names.add(5,"RISAT-2BRI");
   }
   
   public void sort()
   {
	   Collections.sort(Satellite_Names);
   }
   
   public static void main(String [] args)
   {
	   Indian_Satellites obj = new Indian_Satellites();
	   obj.Satellite_Names();
	   obj.update_list();
	   obj.remove_non_operational();
	   System.out.println("Now");
	   obj.display_sat();
	   obj.sort();
	   System.out.println("Now");
	   obj.display_sat();
	   
   }
}
