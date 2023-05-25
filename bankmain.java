package winsem;

//polymorphism ka main
public class bankmain 
{
  public static void main(String [] args)
  {
      Bank obj = new SBI();
      Bank obj1 = new Axis();
      Bank obj2 = new HDFC();
      System.out.println(obj.interest());
      System.out.println(obj1.interest());
      System.out.println(obj2.interest());
  }
}
