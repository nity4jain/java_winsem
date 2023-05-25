package winsem;

public class areacrectangle extends shape
{
  double length;
  double breadth;
  
  areacrectangle(double length,double breadth)
  {
	  this.length = length;
	  this.breadth = breadth;
  }
		  
  double calculatearea()
  {
	  return length*breadth;
  }
}
