
public class FindMaxValue
{
	static int size=10;
	static int GameArr [] = new int [size];
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int max=0;
		Essentials.GenreteRandom(GameArr);
		Essentials.PrintGameArr(GameArr, 0, GameArr.length);
		max=Begginer(GameArr);
		System.out.println(" ");
		System.out.println(max);
	//	Random rd = new Random(); // creating Random object

	}
	
	public static int Begginer (int Game [])
	{
		int MaxValue=Game[0];
		int temp=0;
		for (int i=1;i<Game.length;i++)
		{
			if (Game[i]>MaxValue)
			{
				temp=MaxValue;
				MaxValue=Game[i];
				Game[i]=temp;
			}
		}
		return MaxValue;
	}
	
	
}
