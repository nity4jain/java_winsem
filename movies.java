package winsem;

import java.util.*;
class movies 
{
	 protected String title;
	 protected String rating;
	 protected double duration;
	 Scanner sc = new Scanner (System.in);
	 
	 movies(String title, String rating,double duration)
	 {
		 this.title  = title;
		 this.rating = rating;
		 this.duration = duration;
     }
	 
	 public double calculatePrice()
     {
		 return 10.0;
		 
     }
}

class regularmovie extends movies
{
	 regularmovie(String title, String rating,double duration)
	 {
		 super(title,rating,duration);
		 
     }
  public double calculatePrice()
  {
	  if(this.duration>120)
	  {
		  return 12.0;
	  }
	  else
	  {
		  return 10.0;
	  }
  }
}
	 
class newrelease extends movies
{
	newrelease(String title, String rating,double duration)
	{
		super(title,rating,duration);
	}
	public double calculatePrice()
	{
		return 15.0;
	}
}
 class blockbustermovie extends newrelease
 {
	 public blockbustermovie(String title, String rating,double duration)
	 {
		 super(title,rating,duration);
	 }
	 public double calculatePrice()
	 {
		return 20.0; 
	 }
	 }
 
 
	 
		
