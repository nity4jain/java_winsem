package winsem;

public class Applicant 
{
  int applicant_id;
  String applicant_name;
  Placement obj = new Placement("cs","ai ml",884031198);
  
  Applicant(int a, String b)
  {
	  applicant_id = a;
	  applicant_name = b;
  }
}
