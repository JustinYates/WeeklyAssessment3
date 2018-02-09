package com.company.Question_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Switch {

    public static Scanner input = new Scanner(System.in);

    public static void Answer() {
        try {
            System.out.println("Just uh..Pick a number 1-4?:");
            switch (input.nextInt()) {

                case 1:
                    System.out.println("You hit 1!");
                    break;
                case 2:
                    System.out.println("You hit 2!");
                    break;
                case 3:
                    System.out.println("You hit 3!");
                    break;
                case 4:
                    System.exit(1);
                    break;
                default:
                    System.out.println("you have not selected a valid option");
                    Answer();
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("What are you doing thats not a number 1-4!?");
            Answer();

        }
    }
}

