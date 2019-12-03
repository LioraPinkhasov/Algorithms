package Method;

import java.util.Scanner;

public class FirstMethodGreddyFunctions
{
	static int OddSum=0;
	static int EvenSum=0;
	static int GameArr [] = new int [10];
	static int PlayerOne [] = new int [5];
	static int PlayerTwo [] = new int [5];
	

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); 
		System.out.print("Enter A size: ");
		int size = scan.nextInt();
		GenreteRandom(size);
		PrintGameArr(0,size);



	}

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

	public static void PlayerOneChoise ()
	{
		if (BiggestSum()==true) 
			{
			PlayerOne
			}
		
	}

	public static int PlayerTwoChoise (int a)
	{

		return a;
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

	public static void PrintGameArr (int begin, int end)
	{
		for (int i = 0; i < GameArr.length; i++)
		{
			System.out.print(GameArr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < GameArr.length; i++)
		{
			System.out.print(i + "  ");
		}
	}

	public static void GameArrTrim ()
	{
		int begin = 0;
		int end = GameArr.length;
		int counter = 0;
		while (GameArr[counter]==null)
		{
			
		}
	}
}
