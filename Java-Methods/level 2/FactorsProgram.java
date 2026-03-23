package com.gla.Methods.level2;

import java.util.Scanner;

public class FactorsProgram {

    // Method to find factors and return array
    public static int[] findFactors(int num) {
        int count = 0;

        // First loop → count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop → store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                factors[index++] = i;
        }

        return factors;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int i : arr)
            s += i;
        return s;
    }

    public static int product(int[] arr) {
        int p = 1;
        for (int i : arr)
            p *= i;
        return p;
    }

    public static double sumOfSquares(int[] arr) {
        double s = 0;
        for (int i : arr)
            s += Math.pow(i, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.println("Factors are:");
        for (int i : factors)
            System.out.print(i + " ");

        System.out.println("\nSum = " + sum(factors));
        System.out.println("Product = " + product(factors));
        System.out.println("Sum of Squares = " + sumOfSquares(factors));
    }
}
