package Assignment.BuiltInFunctions.Type1;

/*
Problem Statement:
Fibonacci Sequence Generator:
- Generate Fibonacci sequence up to a specified number of terms.
- Use a function to calculate and print the sequence.
*/

import java.util.Scanner;

public class FibonacciGenerator {
    public static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        generateFibonacci(terms);
        sc.close();
    }
}

