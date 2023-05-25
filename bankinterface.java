package winsem;

public interface bankinterface 
{
 abstract class employee
 {
	 String name;
	 int employeeid;
	 double salary;
	 int hrs;
	 employee(String name, int employeeid,double salary,int hrs)
	 {
		 this.name = name;
		 this.employeeid = employeeid;
		 this.salary = salary;
		 this.hrs = hrs;
	 }
	 public void employeedetails()
	 {
		 System.out.println("Name is "+ name);
		 System.out.println("Employee id "+ employeeid);
		 System.out.println("Salary is "+ salary);
		 System.out.println("Working hours "+ hrs);
	 }
 }
}

class workload implements bankinterface
{
   public double calculate()
	{
		if(hrs<12)
		{
			salary += 200;
		}
		
		else if(hrs>12&&hrs<24)
		{
			salary +=500;
		}
	}
}
