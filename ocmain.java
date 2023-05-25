package winsem;

public class ocmain {

	
	public static void main(String [] args)
	{
		objectcloning obj = new objectcloning(101,"nitya");
		obj.display();
		objectcloning obj1 = (objectcloning)obj.clone();
	}
}
