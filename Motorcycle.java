package winsem;

public class Motorcycle extends vehicle
{
  public int enginesize;
  public String saddlebags;
  
  public Motorcycle(String model,int year,double price,int enginesize,String saddlebags)
  {
	  super(model,year,price);
	  this.enginesize=enginesize;
	  this.saddlebags = saddlebags;
  }
  public int getenginesize()
  {
  return enginesize;
  }
  
  public void setengine(int enginesize)
  {
	  this.enginesize = enginesize;
  }
  
  public String getsaddlebags()
  {
  return saddlebags;
  }
  
  public void setsaddle(String saddlebags)
  {
	  this.saddlebags = saddlebags;
  }
}s
