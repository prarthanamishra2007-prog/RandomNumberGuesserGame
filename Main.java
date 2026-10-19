package com.mishra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("HEY THERE ! WELCOME TO Random number GUESSER GAME!");
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100) + 1;
        int userNumber = 0;
        int invalidAttempts = 0;
        int totalAttempts = 0;
        int finalAttempt = 0;
        do {
            System.out.println("Guess number from 1-100");
            userNumber = sc.nextInt();

            if (userNumber < 1 || userNumber > 100) {
                System.out.println("Please enter number from 1-100 only !");
                invalidAttempts++;
            } else if (userNumber == myNumber) {
                System.out.println("HURRAYYY!!! YOU GUESSED IT ABSOLUTELY CORRECT !");
            } else if (userNumber > myNumber) {
                System.out.println("Ouch ! Your guess is a bit larger than the actual number. Have a next try !");
            } else {
                System.out.println("Nah! Your number is smaller");

            }
            totalAttempts++;


        }
        while (userNumber != myNumber);
        finalAttempt = totalAttempts - invalidAttempts;


        System.out.print("MY NUMBER IS ");
        System.out.println(myNumber);
        System.out.print("Total Number of invalid attempts:");
        System.out.println(invalidAttempts);
        System.out.print("Total Attempts: ");
        System.out.println(totalAttempts);
        System.out.print("The Final number of Attempt which you took to guess the number is ");
        System.out.println(finalAttempt);

    }
}



