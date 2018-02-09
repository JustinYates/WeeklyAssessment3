package com.company.Question_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        ArrayList<String> assessment = new ArrayList<String>();

        assessment.add("A");
        assessment.add("B");
        assessment.add("C");
        assessment.add("D");
        assessment.add("E");
        assessment.add("F");

        switch (input.nextInt()) {

            case 1:
                System.out.println(assessment);

                break;
        }



        /*
        1. In this main method initialize a List as an ArrayList.
        Add 6 values of your choosing to this ArrayList.
        2. Create a new method in this class called displayArray that takes a List parameter.
        3. Have this new method use a ForEach loop to iterate through the ArrayList and display each item to the user.
         */
    }
}
