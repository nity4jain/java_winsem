package winsem;

public class cricketplayermain 
{
  public static void main(String [] args)
  {
	  int i;
	  cricketplayer obj = new cricketplayer();
		for(i=1;i<11;i++)
			{
			obj.get_details();
		obj.print_details();
			}
	  obj.input();
	  obj.display();
  }
}
