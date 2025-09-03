package Assignment.One.LevelTwo;

/*
 Question:
 Write a program to create a basic calculator for addition, subtraction, multiplication, and division.
 The program should ask for two numbers (floating point) and perform all the operations.

 Input: number1, number2
 Output: The addition, subtraction, multiplication, and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___
*/

import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Perform operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display results
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }
}
