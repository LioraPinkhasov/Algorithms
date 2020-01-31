package TheAssistantAlgoritam;
import java.util.Arrays;

public class Essentials
{
	public static double gredyresult=0;
	public static void AvargeTimes(int size, int time[])
	{
		int TimePerPerson [] = new int [size];
		int AvargeTime=0;
		for (int i=0;i<time.length;i++)
		{
			AvargeTime=AvargeTime+time[i];
			TimePerPerson[i]=AvargeTime;
			
		}
		AvarageTime(TimePerPerson);
		System.out.print("The time per person is: ");
		PrintArr(time);
		System.out.println();
		System.out.print("The Avarge Time by intoative algoritam is: ");
		System.out.println();
		PrintArr(TimePerPerson);
		gredyresult = AvargeTime/TimePerPerson.length;
		//System.out.println("The Avarge time by using sample algoritm is: " + AvargeTime);
	}

	public static void GreadyMethod(int size,int time[])
	{
		double AvargeTime=0;
		int timesort [];
		Arrays.sort(time);
		System.out.println("In the Gready Algoritam");
		PrintArr(time);
		
		/*for (int i=1;i<time.length;i++)
		{
			AvargeTime=AvargeTime+time[i];
			
		}
		AvargeTime=AvargeTime/size;*/
		AvargeTimes(time.length,time);
		AvargeTime = gredyresult;
		System.out.println("The Avarge time by using Gready algoritm is: " + AvargeTime);
		
	}
	
	public static int AvarageTime (int TimePerPerson[])
	{
		int avrageTime = 0;
		for (int i=0;i<TimePerPerson.length;i++)
		{
			avrageTime=TimePerPerson[i]+avrageTime;
		}
		avrageTime=avrageTime/TimePerPerson.length;
		return avrageTime;
	}


	public static int[] Times (int size)
	{
		int time[] = new int [size];
		for (int i=0;i<size;i++)
		{
			time[i]= (int)(Math.random()*120);
		}
		//time[]= {7,4,140,1,10,33,12,2,0,11,15};
		return time;
	}

	public static void PrintArr (int time[])
	{
		for (int i=0;i<time.length;i++)
		{
			if (i==0)
			{
				System.out.println("The " + (i+1) + " Person now Waiting, go in ,and sit there: " + time[i]);
			}
			else
			{
				System.out.println("The " + (i+1) + " Person waiting time is: " +time[i]);
			}

		}

		
	}
	

}
