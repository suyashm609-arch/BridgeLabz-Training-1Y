package com.gla.Methods.level2;

import java.util.Scanner;

public class FriendsInfo {

    public static int findYoungest(double[] ages) {
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[index])
                index = i;
        }
        return index;
    }

    public static int findTallest(double[] heights) {
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[index])
                index = i;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        double[] ages = new double[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextDouble();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);

        System.out.println("Youngest Friend: " + names[youngest]);
        System.out.println("Tallest Friend: " + names[tallest]);
    }
}
