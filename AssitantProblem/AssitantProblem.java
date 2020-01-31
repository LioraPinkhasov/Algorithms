package TheAssistantAlgoritam;

import java.util.Scanner;

public class AssitantProblem 
{
	public static void main(String[] args) 
	{
		int size;
		int avg;
	    System.out.print("Plese Enter a number of students: ");
	    Scanner scan = new Scanner(System.in); 
	    size = scan.nextInt();
		//size = 23;
		int time[]=new int[size];
	    //int time [] = {7,4,140,1,10,33,12,2,0,11,15};
		time = Essentials.Times(size);
		System.out.println();
		Essentials.AvargeTimes(size,time);
		//Essentials.AvargeTimes(time.length,time);
		System.out.println();
		Essentials.GreadyMethod(size,time);
		//Essentials.GreadyMethod(time.length,time);
		//System.out.println();
		//avg=secretary.avg(time);
		System.out.println();
		//System.out.println("The Avarge time by using michal algoritm is:"+  avg);
		//System.out.println();
		//SecretaryProblem.qu(time);
		//SecretaryProblem.main(args);
	
	}
	
}
