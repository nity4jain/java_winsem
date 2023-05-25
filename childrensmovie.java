package winsem;

	public class childrensmovie extends movies
	{
		childrensmovie(String title, String rating,double duration)
		{
			super(title,rating,duration);
		}
		
		public double calculatePrice()
		{
			return 8.0;
		}
	}
