package com.gla.Methods.level3;

public class FactorsProgram {

    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                System.out.print(i + " ");
    }
}
