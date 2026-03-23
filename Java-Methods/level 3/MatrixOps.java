package com.gla.Methods.level3;

import java.util.Random;

public class MatrixOps {

    // a. Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10) + 1; // 1 to 10
            }
        }
        return matrix;
    }

    // Helper Method to display matrix
    public static void displayMatrix(int[][] matrix, String title) {
        System.out.println("\n--- " + title + " ---");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    // b. Method to add two matrices
    public static int[][] addMatrices(int[][] m1, int[][] m2) {
        int rows = m1.length, cols = m1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    // c. Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] m1, int[][] m2) {
        int rows = m1.length, cols = m1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return result;
    }

    // d. Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] m1, int[][] m2) {
        int rows1 = m1.length, cols1 = m1[0].length, cols2 = m2[0].length;
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int r = 2, c = 3;

        int[][] A = createRandomMatrix(r, c);
        int[][] B = createRandomMatrix(r, c);
        int[][] C = createRandomMatrix(c, r);

        displayMatrix(A, "Matrix A");
        displayMatrix(B, "Matrix B");
        displayMatrix(addMatrices(A, B), "Addition (A + B)");
        displayMatrix(subtractMatrices(A, B), "Subtraction (A - B)");
        displayMatrix(multiplyMatrices(A, C), "Multiplication (A * C)");
    }
}
