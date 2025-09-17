package Assignment.One.LevelTwo;

import java.util.Scanner;

/*
 * Rewrite the program 4 FizzBuzz using the while loop.
 */
class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer for the FizzBuzz limit: ");
        int number = input.nextInt();

        if (number > 0) {
            int i = 1;
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}
