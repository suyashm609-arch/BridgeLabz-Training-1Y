package com.gla.Methods.level3;

import java.util.*;

public class EmployeeBonus {

    // Method to generate salary and years of service
    public static double[][] generateData() {
        double[][] data = new double[10][2]; // [salary][years]

        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000); // 5-digit salary
            data[i][1] = 1 + (int)(Math.random() * 10); // years between 1-10
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[10][2]; // [newSalary][bonus]

        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            double years = data[i][1];

            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    // Method to display totals
    public static void display(double[][] oldData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("OldSalary\tYears\tBonus\tNewSalary");

        for (int i = 0; i < 10; i++) {
            totalOld += oldData[i][0];
            totalNew += newData[i][0];
            totalBonus += newData[i][1];

            System.out.println(oldData[i][0] + "\t" +
                    oldData[i][1] + "\t" +
                    newData[i][1] + "\t" +
                    newData[i][0]);
        }

        System.out.println("\nTotal Old Salary = " + totalOld);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + totalNew);
    }

    public static void main(String[] args) {
        double[][] oldData = generateData();
        double[][] newData = calculateBonus(oldData);
        display(oldData, newData);
    }
}
