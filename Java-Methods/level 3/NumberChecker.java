package com.gla.Methods.level3;

public class NumberChecker {

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            d[i] = s.charAt(i) - '0';
        return d;
    }

    public static boolean isArmstrong(int n) {
        int[] d = getDigits(n);
        int sum = 0;
        for (int x : d)
            sum += Math.pow(x, d.length);
        return sum == n;
    }

    public static boolean isDuck(int n) {
        return String.valueOf(n).contains("0");
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println("Digits: " + countDigits(n));
        System.out.println("Armstrong: " + isArmstrong(n));
        System.out.println("Duck: " + isDuck(n));
    }
}
