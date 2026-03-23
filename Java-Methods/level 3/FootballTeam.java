package com.gla.Methods.level3;

public class FootballTeam {

    public static int sum(int[] arr) {
        int s = 0;
        for (int n : arr) s += n;
        return s;
    }

    public static int min(int[] arr) {
        int m = arr[0];
        for (int n : arr) if (n < m) m = n;
        return m;
    }

    public static int max(int[] arr) {
        int m = arr[0];
        for (int n : arr) if (n > m) m = n;
        return m;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];

        for (int i = 0; i < 11; i++)
            heights[i] = 150 + (int)(Math.random() * 101);

        System.out.println("Heights:");
        for (int h : heights) System.out.print(h + " ");

        System.out.println("\nMean: " + (double)sum(heights)/11);
        System.out.println("Shortest: " + min(heights));
        System.out.println("Tallest: " + max(heights));
    }
}
