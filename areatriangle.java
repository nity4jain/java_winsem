package winsem;

public class areatriangle extends shape
{
  double base,heigth;
  
  areatriangle(double base, double heigth)
  {
	  this.base = base;
	  this.heigth = heigth;
  }
  
  double calculatearea()
  {
	  return 0.5*base*heigth;
  }
}
