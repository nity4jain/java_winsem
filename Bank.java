package winsem;

//polymorphism
public class Bank 
{
  float interest() {
	  return 0;
  }
}
class SBI extends Bank
{
	float interest()
	{
		return 10.10f;
	}
}
class Axis extends Bank
{
	float interest()
	{
		return 6.0f;
	}
}

class HDFC extends Bank
{
	float interest()
	{
		return 9.0f;
	}
}
