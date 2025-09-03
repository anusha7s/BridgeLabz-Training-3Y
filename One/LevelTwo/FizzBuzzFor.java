package Assignment.One.LevelTwo;

import java.util.Scanner;

/*
 * Write a program FizzBuzz, take a number as user input, and check for a
 * positive integer. If positive integer, loop and print the number, but for
 * multiples of 3 print "Fizz" instead of the number, for multiples of 5 print
 * "Buzz", and for multiples of both print "FizzBuzz".
 */
class FizzBuzzFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer for the FizzBuzz limit: ");
        int number = input.nextInt();

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}
