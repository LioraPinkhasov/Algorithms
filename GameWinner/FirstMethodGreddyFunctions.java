package Method;

import java.util.Arrays;
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
		int SumPlayer1 = 0;
		int SumPlayer2 = 0;
		Essentials.GenreteRandom(size);
		Essentials.PrintGameArr(0,size);
		for (int i=0;i<GameArr.length/2;i++)
		{
			PlayerOne[i]=Essentials.PlayerOneChoise();
			PlayerTwo[i]=Essentials.PlayerTwoChoise();
		}

	
		System.out.println("im here");
	Essentials.PrintSum(PlayerOne, 1);
	Essentials.PrintSum(PlayerTwo, 2);



	}

	
}
