
public class FindMinMaxValue
{
	static int size=18;
	static int GameArr [] = new int [size];

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int max []= new int [2];
		Essentials.GenreteRandom(GameArr);
		Essentials.PrintGameArr(GameArr, 0, GameArr.length);
		max =FindMinMaxValueAdvance(GameArr);
		System.out.println(" ");
		Essentials.PrintGameArr(max, 0, max.length);
		//	Random rd = new Random(); // creating Random object

	}

	public static int [] FindMinMaxValueBegginer (int GameArr[])
	{
		int Values [];
		Values = new int [2];
		int MaxValue = GameArr[0];
		int MinValue = GameArr[0];
		int temp = 0;

		for (int i=0;i<GameArr.length;i++)
		{
			if (GameArr[i]>MaxValue)
			{
				temp=MaxValue;
				MaxValue=GameArr[i];
				GameArr[i]=MaxValue;
			}
			else if (GameArr[i]<MinValue)
			{
				temp=MinValue;
				MinValue=GameArr[i];
				GameArr[i]=temp;
			}

		}

		Values[0]=MinValue;
		Values[1]=MaxValue;

		return Values;
	}
	
	public static int [] FindMinMaxValueAdvance (int GameArr[])
	{
		int Values [];
		Values = new int [2];
		int MaxValue = GameArr[1];
		int MinValue = GameArr[0];
		int count = 0;
		
		if (MaxValue<MinValue)
		{
			MaxValue = GameArr[0];
			MinValue = GameArr[1];
		}
		
		for (int i=2;i<GameArr.length-1;i=i+2)
			{
			count++;
			if (GameArr[i]<=GameArr[i+1])
			{
				count=count+2;
				if (GameArr[i]<MinValue)
				{
					MinValue=GameArr[i];
				}
				
				if (GameArr[i+1]>MaxValue)
				{
					MaxValue=GameArr[i+1];
				}
			}
			else
			{
				count = count +2;
				if (GameArr[i]<MinValue)
				{
					MinValue=GameArr[i];
				}
				
				if (GameArr[i+1]>MaxValue)
				{
					MaxValue=GameArr[i+1];
				}
			}
			}
		
		if (GameArr.length%2!=0)
		{
			count++;
			if (GameArr[GameArr.length-1] > MaxValue)
			{
				MaxValue=GameArr[GameArr.length-1];
			}
			else
			{
				count++;
				if (GameArr.length-1<MinValue)
				{
					MinValue=GameArr.length-1;
				}
			}
		}
		
		Values[0]=MinValue;
		Values[1]=MaxValue;
		
		//System.out.println(" ");
		//System.out.println(count);
		return Values;
	}
	
	
}
