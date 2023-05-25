package winsem;

public class Branch extends Company
{
	String name;
  Branch(String company_name,int base_value,int returns,String name)
  {
	  super(company_name,base_value,returns);
	  this.name = name;
  }
  
  void printcompany()
  {
	  System.out.println("name "+name);
  }
}
