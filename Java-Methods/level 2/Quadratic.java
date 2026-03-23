package com.gla.Methods.level2;

import java.util.Scanner;

public class Quadratic {
    public static double[] findRoots(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0)
            return new double[]{(-b + Math.sqrt(d)) / (2 * a),
                    (-b - Math.sqrt(d)) / (2 * a)};
        else if (d == 0)
            return new double[]{-b / (2 * a)};
        else
            return new double[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a b c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double[] r = findRoots(a, b, c);

        if (r.length == 2)
            System.out.println("Roots: " + r[0] + ", " + r[1]);
        else if (r.length == 1)
            System.out.println("One Root: " + r[0]);
        else
            System.out.println("No Real Roots");
    }
}
