package winsem;

import java.util.*;
class WorkingHours
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    try
{
    System.out.println("Enter the number of working hours");
    int hrs = sc.nextInt();
if(hrs<0)
{
throw new InvalidHoursException("Only Positive value");
}
if(hrs>40)
{
 throw new InvalidHoursException("Max Working hours is 40");
}
double wages=0.0;
 if (hrs <= 10) {
            wages = hrs*100;
        } else if (hrs <= 20) {
            wages = wages+((hrs-10)*150);
        } else {
            wages = wages + (hrs-20)*200;
        }
System.out.println("Wages are "+wages);
}
catch(InvalidHoursException e)
{
  System.out.println(e.getMessage());
}
}
}