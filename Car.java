package winsem;

public class Car extends vehicle
{
	public int door;
	public String AC;
   public Car(String model,int year,double price,int door,String AC)
   {
     super(model,year,price);
	   this.door = door;
	   this.AC = AC;
   }
   
   public int getdoor()
	  {
	  return door;
	  }
	  
	  public void setdoor(int door)
	  {
		  this.door = door;
	  }
	  
	  public String getAC()
	  {
	  return AC;
	  }
	  
	  public void setAC(String AC)
	  {
		  this.AC = AC;
	  }
	
}
