package winsem;

public class Applicantmain 
{
  public static void main(String [] args)
  {
	  Applicant obj1 = new Applicant(2345,"Nitya");
	  Placement obj = new Placement("cs","ai ml",884031198);
	  obj1 = obj;
	  System.out.println(obj1);
	}
  }
}
