package winsem;

import java.util.*;
public class oopspractice 
{
 int age;
 int roll;
 String name;
 Scanner sc = new Scanner(System.in);
 
 void input()
 {
	 System.out.println("Enter the names ");
	 name = sc.next();
	 System.out.println("Enter the roll number ");
	 roll = sc.nextInt();
	 System.out.println("Enter the age ");
	 age = sc.nextInt();
	 
 }   
 
 void display()
 {
	 System.out.println("The name is "+name);
	 System.out.println("The roll number is "+roll);
	 System.out.println("The age is "+age);
 }
 
}




