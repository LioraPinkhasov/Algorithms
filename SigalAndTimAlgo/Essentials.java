package SigalAndTimAlgo;

import java.util.Random;
import java.util.Scanner;

public class Essentials
{
    //see how works the 50% algorithm where every one of the players say the opposite of what he gets
    public static void fifthyprecent ()
    {
        int count = 0;
        double avg = 0;


        Random R = new Random();
        int sigal = R.nextInt(2);
        int SigalSay = sigal;
        int Tim = R.nextInt(2);
        int TimSay = Tim;
        int numOfrounds=40000;
        for (int i = numOfrounds; i > 0; i--) {
            sigal = R.nextInt(2);
            System.out.println("Sigal have:" + sigal);


            //50 precent
            if (sigal == 0) {
                SigalSay = 1;
                System.out.println("Sigal said:" + SigalSay);
            } else {
                SigalSay = 0;
                System.out.println("Sigal said:" + SigalSay);
            }


            Tim = R.nextInt(2);
            System.out.println("Tim is:" + Tim);
            if (Tim == 0) {
                TimSay = 1;
                System.out.println("Tim said:" + TimSay);
            } else {
                TimSay = 0;
                System.out.println("Tim said:" + TimSay);
            }

            if (SigalSay==Tim)
            {
                count++;
                System.out.println("Sigal Was Right");
            }

            else if (TimSay==sigal)
            {
                count++;
                System.out.println("Tim Was Right");
            }


            System.out.println("---------");



        }
        System.out.println("The count is:" + count);
        avg=(double)count/(double)numOfrounds;
        System.out.println("the avg for this way of play is : " + avg);

    }

    //see how works the 75% algorithm where every one of the players say '1'
    public static void seventyfiveprecent ()
    {
        int count = 0;
        double avg = 0;


        Random R = new Random();
        int sigal = R.nextInt(2);
        int SigalSay = sigal;
        int Tim = R.nextInt(2);
        int TimSay = Tim;
        int numOfrounds=40000;
        for (int i = numOfrounds; i > 0; i--) {
            sigal = R.nextInt(2);
            System.out.println("Sigal have:" + sigal);


            //75 precent
            if (sigal == 0) {
                SigalSay = 1;
                System.out.println("Sigal said:" + SigalSay);
            } else {
                SigalSay = 1;
                System.out.println("Sigal said:" + SigalSay);
            }


            Tim = R.nextInt(2);
            System.out.println("Tim is:" + Tim);
            if (Tim == 0) {
                TimSay = 1;
                System.out.println("Tim said:" + TimSay);
            } else {
                TimSay = 1;
                System.out.println("Tim said:" + TimSay);
            }

            if (SigalSay==Tim)
            {
                count++;
                System.out.println("Sigal Was Right");
            }

            else if (TimSay==sigal)
            {
                count++;
                System.out.println("Tim Was Right");
            }


            System.out.println("---------");



        }
        System.out.println("The count is:" + count);
        avg=(double)count/(double)numOfrounds;
        System.out.println("the avg for this way of play is : " + avg);

    }

    //see how works the 100% algorithm where one of the players say the opposite of what he gets and
    // the anoter say what he gets.
    public static void onehundrendprecent ()
    {
        int count = 0;
        double avg = 0;


        Random R = new Random();
        int sigal = R.nextInt(2);
        int SigalSay = sigal;
        int Tim = R.nextInt(2);
        int TimSay = Tim;
        int numOfrounds=40000;
        for (int i = numOfrounds; i > 0; i--) {
            sigal = R.nextInt(2);
            System.out.println("Sigal have:" + sigal);


            //100 precent
            if (sigal == 0) {
                SigalSay = 1;
                System.out.println("Sigal said:" + SigalSay);
            } else {
                SigalSay = 0;
                System.out.println("Sigal said:" + SigalSay);
            }


            Tim = R.nextInt(2);
            System.out.println("Tim is:" + Tim);


            if (SigalSay==Tim)
            {
                count++;
                System.out.println("Sigal Was Right");
            }

            else if (Tim==sigal)
            {
                count++;
                System.out.println("Tim Was Right");
            }


            System.out.println("---------");



        }
        System.out.println("The count is:" + count);
        avg=(double)count/(double)numOfrounds;
        System.out.println("the avg for this way of play is : " + avg);

    }
}
