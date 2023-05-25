package winsem;

public class Company
{
  String company_name;
  int base_value;
  int returns;
  
  Company(String company_name,int base_value,int returns)
  {
	  this.company_name=company_name;
	  this.base_value = base_value;
	  this.returns = returns;
  }
  
  void printcompany()
  {
	  System.out.println("Company name "+ company_name);
	  System.out.println("Base value "+base_value);
	  System.out.println("Returns "+ returns);
  }
  
  
}
