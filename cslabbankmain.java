package winsem;

public class cslabbankmain
{
	public static void main(String [] args)
	{
		cslabbankdep obj = new cslabbankdep("Nitya",2345,98764,42597,90);
		obj.calculate();
		obj.display();
		System.out.println();
		cslabbankwithdraw obj1 = new cslabbankwithdraw("Khushi",12345,90764,78976,90,98);
		obj1.calculate();
		obj1.display();
	}
}
