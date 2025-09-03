package Assignment.One.LevelTwo;

import java.util.Scanner;

/*
 * Create a program to print odd and even numbers between 1 to the number
 * entered by the user.
 */
class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        } else {
            System.out.println("Please enter a natural number (positive integer).");
        }

        input.close();
    }
}
