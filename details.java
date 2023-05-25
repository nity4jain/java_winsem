package winsem;

public class details
{
 int rollnumber;
 String phonenumber;
 String address;
 
 public int setRnumber(int rno)
 {
	 rollnumber = rno;
	 return rollnumber;
 }
	public String setpnumber(String p)
	{
		phonenumber = p;
		return phonenumber;
	}
	public String setAddress(String a)
	{
		address = a;
		return address;
	}
}
	public class main
	{
		public static void main(String[] args)
		{
			details sam = new details();
			System.out.println("Sams's info");
			System.out.println("Roll number "+sam.setRnumber(2));
			System.out.println("Phone number "+sam.setpnumber("0987654321"));
			System.out.println("Address "+ sam.setAddress("456 phanitha street "));
		    
			details john = new details();
			System.out.println("Johns info");
			System.out.println("Roll number "+john.setRnumber(2));
			System.out.println("Phone number "+john.setpnumber("0123456789"));
			System.out.println("Address "+ john.setAddress("289 phanitha ka ghar "));
		    
			
		}
	}
