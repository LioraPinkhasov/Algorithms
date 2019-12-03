
public class FirstMethodFindMaxValueBegginer
{
	static int size=10;
	static int GameArr [] = new int [size];
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int max=0;
		GenreteRandom(size);
		PrintGameArr(0,GameArr.length);
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
	}
	
	
}
