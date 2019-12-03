
public class Essentials 
{
	//static int size=10;
	//static int GameArr [] = new int [size];
	
	public static int[] GenreteRandom (int [] GameArr)
	{
		for (int i = 0; i < GameArr.length; i++)
		{
			GameArr[i] =  (int) (Math.random() * 100); 
		}
		return GameArr;
	}
	
	
	public static void PrintGameArr (int [] GameArr, int begin, int end)
	{
		for (int i = 0; i < GameArr.length; i++)
		{
			System.out.print(GameArr[i] + " ");
		}
	}

}
