package com.gla.Methods.level3;

import java.util.*;

public class MatrixShort {
    static Random r = new Random();

    // Create, Randomize, and Display Matrix
    static double[][] getM(int n) {
        double[][] m = new double[n][n];

        for (int i = 0; i < n * n; i++) {
            m[i / n][i % n] = r.nextInt(10);
        }
        return m;
    }

    static void show(double[][] m, String s) {
        System.out.println("\n" + s);
        for (double[] row : m)
            System.out.println(Arrays.toString(row));
    }

    // Transpose
    static double[][] trans(double[][] m) {
        double[][] t = new double[m.length][m.length];

        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m.length; j++)
                t[j][i] = m[i][j];

        return t;
    }

    // Determinant
    static double det(double[][] m) {
        if (m.length == 2)
            return m[0][0] * m[1][1] - m[0][1] * m[1][0];

        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Inverse
    static double[][] inv(double[][] m) {
        double d = det(m);
        if (d == 0)
            return null;

        if (m.length == 2)
            return new double[][]{
                    {m[1][1] / d, -m[0][1] / d},
                    {-m[1][0] / d, m[0][0] / d}
            };

        double[][] res = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int i1 = (i + 1) % 3;
                int i2 = (i + 2) % 3;
                int j1 = (j + 1) % 3;
                int j2 = (j + 2) % 3;

                res[j][i] = (m[i1][j1] * m[i2][j2] - m[i1][j2] * m[i2][j1]) / d;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        double[][] m = getM(3);

        show(m, "Matrix:");
        show(trans(m), "Transpose:");

        System.out.println("Determinant: " + det(m));

        double[][] i = inv(m);
        if (i != null)
            show(i, "Inverse:");
        else
            System.out.println("Inverse not possible");
    }
}