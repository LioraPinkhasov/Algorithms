package PrisonersAlgoritam;
import java.util.Scanner;


public class Prisoners
{
	public static void main(String[] args) 
	{
		//define variable for number of prisoners
		int prisoners = 0;

		//define variable to see if all the prisoners was in the room
		int check=0;

		//scan from the user number of the prisoners
		System.out.print("plese enter number of Prisoners: ");
		Scanner scan = new Scanner(System.in); 
		prisoners = scan.nextInt();

		//send them to the algorithm
		check = Essentials.lampon(prisoners);

		//check if all the prisoners was in the room
		if (check == prisoners)
		{
			System.out.println("When the lamp status know, the number of prisoners which was in the room is " + check + " so all the Prisoners was in the room!");
		}
		
		//send them to the unknown status of the lamp algorithm
		Essentials.lampunkown(prisoners);
		
		//check if all the prisoners was in the room
		if (check == prisoners)
		{
			System.out.println("When the lamp status unknow, he number of the Prisoners witch was in the room is " + check + " so all the Prisoners was in the room!");
		}
		
		System.out.println("The manger decide give them Freedom!");
		

	}
}

