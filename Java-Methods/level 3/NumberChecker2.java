package com.gla.Methods.level3;

public class NumberChecker2 {

    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean isHarshad(int n) {
        return n % sumDigits(n) == 0;
    }

    public static void main(String[] args) {
        int n = 21;
        System.out.println("Sum of digits: " + sumDigits(n));
        System.out.println("Harshad: " + isHarshad(n));
    }
}
