package com.gla.Methods.level3;

import java.util.Scanner;
public class StudentScoreCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Generate marks and calculate stats
        int[][] marksArray = generateScores(numStudents);
        double[][] statsArray = calculateStats(marksArray);

        // d. Display the scorecard
        displayScorecard(marksArray, statsArray);

        sc.close();
    }

    // b. Method to generate random 2-digit scores for PCM
    public static int[][] generateScores(int n) {
        int[][] marks = new int[][]; // Columns: 0=Phy, 1=Chem, 2=Math
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // Generates a random number between 10 and 99
                marks[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
        return marks;
    }

    // c. Method to calculate total, average, and percentages
    public static double[][] calculateStats(int[][] marks) {
        int n = marks.length;
        double[][] stats = new double[3]; // Columns: 0=Total, 1=Avg, 2=Percentage

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Rounding to 2 decimal places using Math.round
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    // d. Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] marks, double[][] stats) {
        System.out.println("\n--- Student Scorecard ---");
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\tPerc%\tGrade");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            double p = stats[i][2];
            String grade = getGrade(p);

            System.out.println((i + 1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2] + "%\t" +
                    grade);
        }
    }

    // Helper method to determine grade based on the table in your image
    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        if (percentage >= 40) return "E";
        return "R";
    }
}