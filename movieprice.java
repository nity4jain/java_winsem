package winsem;

public class movieprice extends moviemanagement
	{
		int n;
		double tax;
		movieprice(String movie_name, String type, String director_name,int n)
		{
			super(movie_name,type,director_name);
			this.n = n;
		}
		
		double calculateprice()
		{
			if(type.equals("2d"))
			{
				amount = n*120;
			}
			else if(type.equals("3d"))
			{
				amount = n*150;
			}
				return amount;
		}
		
		double taxprice()
		{
			if(type.equals("2d"))
			{
				tax = 0.2*amount;
				amount = amount+tax;
			}
			else if(type.equals("3d"))
			{
				tax = 0.25*amount;
				amount = amount+tax;
			}
			return amount;
		}
	}
