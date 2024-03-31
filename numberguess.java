/*CODSOFT PROJECT 1: NUMBER GUESSING PROGRAM USING JAVA */


import java.util.Scanner;
import java.util.Random;

class numberguess
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String option;
        do{
            System.out.println("Do you want to play this game..(Y/N)");
            option=scan.next();
            if(option.equalsIgnoreCase("N"))
            {
                System.out.println("Thank you for playing");
                break;
            }
            System.out.println("--------------");
            System.out.println("game started");
            System.out.println("--------------");
            numberguess1();
        }
        while(option.equalsIgnoreCase("Y"));           
    }

public static void numberguess1()
{
       System.out.println("You are provided with 10 chance..");
        int chance=10;
        int score=0;
        Random rand=new Random();
        int num=rand.nextInt(100);
        Scanner scan=new Scanner(System.in);
        while(chance>0)
        {
            System.out.println("Enter your guess:");
            int guess=scan.nextInt();

            if(guess==num)
            {
                System.out.println("You won the game");
                ++score;
                System.out.println("your score " + score);
                break;
            }
            else if(guess>num)
            {
                System.out.println("you are too high");
            }
            else
            {
                System.out.println("you are too low");
            }
            chance--;
            if(chance==0)
            {
                System.out.println("you lost..the numbers is:" + num);
            }
            else
            {
                System.out.println("You have only "+ chance+" chances");
            }
        }
   }
}

