package Method;

//import java.util.Random;

public class FirstMethodGreddyBasic {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int GameArr [] = new int [10];
	//	Random rd = new Random(); // creating Random object
		int SumEven = 0;
		int SumOdd = 0;
		int CheckEven =0;
		int PlayerOne [] = new int [5];
		int PlayerTwo [] = new int [5];
		for (int i = 0; i < GameArr.length; i++)
		{
			GameArr[i] =  (int) (Math.random() * 100); // storing random integers in an array
			System.out.println(GameArr[i]); // printing each array element
			CheckEven =GameArr[i]%2;
			//System.out.println("the number after checking is: " + CheckEven);
			
			if (CheckEven==0)
			{
				SumEven=SumEven+GameArr[i];
			}
			else
				SumOdd=SumOdd+GameArr[i];
		}
		System.out.println("SumEven = "+ SumEven);
		System.out.println("SumOdd = "+ SumOdd);
		
		if (SumEven>SumOdd)
		{
			PlayerOne[0]=0;
		}
		else
			PlayerOne[0]=GameArr[GameArr.length];
		
		for (int i=0;i<=5;i++)
		{
			/*if (PlayerOne[0]!=null)
			{
				for (i=0;i<=GameArr.length-1;i++)
				{
					System.out.print(GameArr[i]+" ,");
				}
			}*/
			System.out.println("Enter a number:");
		}

	}
}
