package winsem;
import java.util.*;
public class cricketplayer
{
	int player_id;
	String name;
	Scanner sc = new Scanner (System.in);
	int runs_scored [] = new int [10];
	int wickets_taken [] = new int [10];
	static int[] team_score = new int [10];
	void get_details()
	{
	    player_id = sc.nextInt();
	    name = sc.nextLine();
	}
	
	void print_details()
	{
		System.out.println("Player id "+player_id);
		System.out.println("Name "+name);
	}
	
	void input()
	{
		int i;
	System.out.println("Enter runs scored, wicekts taken and team score ");
	for(i=0;i<10;i++)
	{
	    runs_scored[i] = sc.nextInt();
	    wickets_taken[i] = sc.nextInt();
	    team_score [i] = sc.nextInt();
	}
	}
	void display()
	{
		int i;
		for(i=0;i<10;i++)
		{
			System.out.print(runs_scored[i]+"\t");
		}
		
		for(i=0;i<10;i++)
		{
			System.out.print(wickets_taken[i]+"\t");
		}
		
		for(i=0;i<10;i++)
		{
			System.out.print(team_score[i]+"\t");
		}
	}
	}
