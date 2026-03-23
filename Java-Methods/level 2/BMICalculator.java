package com.gla.Methods.level2;

import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightMeters = data[i][1] / 100;   // cm to meter
            data[i][2] = weight / (heightMeters * heightMeters);
        }
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];  // weight, height, bmi

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        calculateBMI(data);

        System.out.println("\nWeight  Height  BMI  Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.1f  %.1f  %.2f  %s\n",
                    data[i][0], data[i][1], data[i][2],
                    getStatus(data[i][2]));
        }
    }
}