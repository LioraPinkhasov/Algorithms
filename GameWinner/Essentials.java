package Method;

import java.util.Scanner;

public class Essentials 
{
	static int size=10;
	static int OddSum=0;
	static int EvenSum=0;
	static int GameArr [] = new int [size];
	static int PlayerOne [] = new int [size/2];
	static int PlayerTwo [] = new int [size/2];
	static int countBegin =0;
	static int countEnd=GameArr.length;
	
	public static void sum ()
	{
		int a=0;
		for (int i=0;i<=GameArr.length ;i++) 
		{
			a=GameArr[i];	
			if (even(a)==true)
			{
				EvenSum=EvenSum+a;
			}
			else
			{
				OddSum=OddSum+a;
			}
		}
	}

	public static boolean BiggestSum ()
	{
		if (EvenSum>OddSum)
			return true;
		else if (OddSum>EvenSum)
			return false;
		else
			return true;
		
	}

	public static boolean even (int a)
	{
		int num=a;
		if (num%2==0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public static int PlayerOneChoise ()
	{
		int take=0;
		if (countBegin == 0 || countEnd == GameArr.length)	
		{
			
		if (BiggestSum()==true) 
			{
			take = GameArr[countBegin];
			countBegin++;
			}
		else
			{
			take = GameArr[countEnd];
			countEnd--;
			}
		}
		else
			if (GameArr[countBegin]>GameArr[countEnd])
			{
				take = GameArr[countBegin];
				countBegin++;
			}
			else
			{
				take = GameArr[countEnd];
				countEnd--;
			}
		System.out.println();
		System.out.println("Player 1 take: " + take + " from the number array.");
	/*  System.out.println(countBegin);
        System.out.println(countEnd);*/
		  
		return take;
		
	}

	public static int PlayerTwoChoise ()
	{
		System.out.println();
		PrintGameArr(countBegin, countEnd);
		System.out.println();
		System.out.print("Enter your choice here : ");
	    String take;
	    int take2;

	    Scanner scanIn = new Scanner(System.in);
	    take = scanIn.nextLine();
	    
	   if (Integer.parseInt(take)==GameArr[countBegin])
		   countBegin++;
	   
	   else
		   countEnd--;
		//return a;
	//   System.out.println(countBegin);
	//   System.out.println(countEnd);
	   return Integer.parseInt(take);
	}

	public static void GretestSum (int a)
	{
		boolean even = even(a);
		if (even==true)
			EvenSum=EvenSum+a;
		else
			OddSum=OddSum+a;
	}

	public static void GenreteRandom (int size)
	{		
		for (int i = 0; i < GameArr.length; i++)
		{
			GameArr[i] =  (int) (Math.random() * 100); 
		}
		
	}
	
	public static void DiffrentNumsInArray (int size)
	{
	int j=GameArr[0];
	int cou=0;
	int mona=0;
	while (j!=GameArr[cou])
		{
			mona++;
			j++;
		}
		
	if (j==GameArr.length)
		{
			GenreteRandom(size);
		}
	}

	public static void PrintGameArr (int countBegin, int countEnd)
	{
		for (int i = countBegin; i < countEnd; i++)
		{
			System.out.print(GameArr[i] + " ");
		}
		System.out.println();
		for (int i = countBegin; i < countEnd; i++)
		{
			System.out.print(i + "  ");
		}
	}

	public static void PrintSum (int Player [] , int PlayerID)
	{
		
		int mona =0;
		int sum=0;
		for (mona=0;mona<Player.length;mona++)
		{
	//		System.out.println(Player[mona]);
			sum = sum + Player[mona];
		}
		System.out.println("The sum of the Player " + PlayerID + " is: " + sum );
	}
	/*public static int left (int countBegin, int countEnd)
	{
		int count=
		return count;
		
	}*/
	/*public static void GameArrTrim ()
	{
		int begin = 0;
		int end = GameArr.length;
		int counter = 0;
		while (GameArr[counter]==null)
		{
			
		}
	}*/
}
