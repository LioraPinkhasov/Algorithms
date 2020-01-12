package PrisonersAlgoritam;

public class Essentials 
{

	public static int lampon (int n)
	{
		//define counter
		int ok = 0;

		//define array for prisoners
		int P_in[] = new int [n];

		//define lamp status on=true, off=false
		boolean lamp = true;

		//while loop for all the prisoners
		while (ok<n)
		{
			//chose random prisoner
			int p = (int)(Math.random()*n);

			//check if p is the counter
			if (p==0)
			{
				//check if it is his first time in the room
				if(P_in[p]==0)
				{
					P_in[p]=1;

					//count ++
					ok++;
				}

				//check if the lamp is off
				if (!lamp)
				{
					//turn on the light
					lamp=true;

					//add +1 to counter
					ok++;
				}
			}
			else
			{
				if (P_in[p]==0 && lamp)
				{
					//turn off the light
					lamp=false;

					//Declare the prisoner was in the room
					P_in[p]=1;

				}

			}
		}
		return ok;
	}

	public static void lampunkown (int n)
	{
		//define lamp status on=true, off=false, now we do it by random
		boolean lamp = (int)(Math.random()*2)==0?false:true;
		//System.out.println(lamp);
		//while the lamp is off
		while (!lamp)
		{
			//chose random prisoner
			int p = (int)(Math.random()*n);
			
			//if the prisoner is the counter
			if (p==0)
			{
				//turn on the lights
				lamp=true;
				
				//back to the original function
				lampon(p);
			}
		}
	}
}
