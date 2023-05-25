package winsem;

public interface eatables
{
  void eat();
}

class potato implements eatables
{
	public void eat()
	{
		System.out.println("eating potatoes");
	}
}

class glass implements eatables
{
	public void eat()
	{
		System.out.println("cannot eat glass");
	}
}

class eatableinterface
{
	public static void main(String [] args)
	{
		eatables obj = new glass();
		obj.eat();
	}
}