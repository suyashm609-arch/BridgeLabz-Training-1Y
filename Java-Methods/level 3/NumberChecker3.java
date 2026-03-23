package com.gla.Methods.level3;

public class NumberChecker3 {

    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    public static void main(String[] args) {
        int n = 121;
        System.out.println("Palindrome: " + isPalindrome(n));
    }
}
