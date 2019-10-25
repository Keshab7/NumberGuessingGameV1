package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int userNumber;
        int correctNumber;
        correctNumber = 7;
        Scanner Keyboard = new Scanner(System.in);
        System.out.println();
        do {
            System.out.println("Guess a number 1-100");
            userNumber = Keyboard.nextInt();

        } while (userNumber != correctNumber);
    }

    public static String randomNumberGuessing(int userNumber, int correctNumber){
        if (userNumber > 7) {
            System.out.println("Too High, Try Again");
        } else if (userNumber < 7) {
            System.out.println("Too Low, Try Again");
        } else
            System.out.println("Perfect");
    }

}
