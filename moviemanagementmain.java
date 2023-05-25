package winsem;
public class moviemanagementmain
	{
	   public static void main(String [] args)
	   {
		   movieprice obj = new movieprice("The notebook","2d","Ankita",100);
		   obj.calculateprice();
		   double c = obj.taxprice();
		   System.out.println("Rs"+c+" for "+obj.n+" members");
	   }
	}
