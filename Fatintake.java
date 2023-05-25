package winsem;
public class Fatintake extends dietchart
{
	Fatintake(int vitaminA, int vitaminC,int Protien,int fats)
	{
		super(vitaminC,vitaminA,Protien,fats);
	}
	
	public void fitness()
	{
		if(age<18 && fats<=86 )
		{
			System.out.println("Your child is fit");
		}
		else if (age>=51&&g=="Male"&&fats<=30)
			System.out.println("You are fit");
		else if(age>= 51 && g == "Female"&&fats<=20)
			System.out.println("You are fit");
		else
			System.out.println("decrease your fats intake");
	}
}
