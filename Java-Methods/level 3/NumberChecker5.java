package com.gla.Methods.level3;

public class NumberChecker5 {

    public static int sumDiv(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++)
            if (n % i == 0) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        int n = 6;
        int sum = sumDiv(n);

        System.out.println("Perfect: " + (sum == n));
        System.out.println("Abundant: " + (sum > n));
        System.out.println("Deficient: " + (sum < n));
    }
}
