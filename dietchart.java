package winsem;

import java.util.*;
public class dietchart 
{
   int vitaminA;
   int vitaminC;
   int Protien;
   int fats;
   String name;
   int age;
   String g;
   Scanner sc = new Scanner (System.in);
   dietchart(int vitaminA, int vitaminC, int Protien, int fats)
   {
	   this.vitaminA = vitaminA;
	   this.vitaminC = vitaminC;
	   this.Protien = Protien;
	   this.fats = fats;
   }
   
   void input()
   {
	   System.out.println("Enter the name of the person");
	   name = sc.nextLine();
	   System.out.println("Enter the age ");
	   age = sc.nextInt();
	   System.out.println("Enter the gender");
	   g = sc.nextLine();
   }
   void fitness()
   {
	   
   }
}

