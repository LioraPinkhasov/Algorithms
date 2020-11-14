package SigalAndTimAlgo;

import java.util.Random;
import java.util.Scanner;

public class SigalAndTim
{
    public static void main(String[] args)
    {
        //to shortcut print we need to write 'sout' + tab
        Scanner scan = new Scanner(System.in);
        System.out.println("press on one of the options below:");
        System.out.println("50 % = press 1");
        System.out.println("75 % = press 2");
        System.out.println("100 % = press 3");
        System.out.print("Enter A size: ");
        int press = scan.nextInt();
        switch (press)
        {
            case 1:
                Essentials.fifthyprecent();
                break;
            case 2:
                Essentials.seventyfiveprecent();
                break;
            case 3:
                Essentials.onehundrendprecent();
                break;
        }

    }

}
