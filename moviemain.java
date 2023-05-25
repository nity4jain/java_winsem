package winsem;

public class moviemain 
{
	
		 public static void main(String [] args)
		 {
			 int i =20;
			 i = i+10;
			 System.out.println(i); 
			 
			 movies obj = new regularmovie("The Matrix", "R",136);
			 movies obj1 = new childrensmovie("The Aristocats","G",90);
			 movies obj2 = new newrelease("Spider Man", "PG-13",150);
			 movies obj3 = new blockbustermovie("Avengers- End Game","PG-143",181);
			 
			 double regular = obj.calculatePrice();
			 double children = obj1.calculatePrice();
			 double newrelease = obj2.calculatePrice();
			 double blockbuster = obj3.calculatePrice();
			 
			 System.out.println(obj.title+" price is $"+regular);
			 System.out.println(obj1.title+" price is $"+children);
			 System.out.println(obj2.title+" price is $"+newrelease);
			 System.out.println(obj3.title+" price is $"+blockbuster);
		 }
	 }
