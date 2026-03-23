package com.gla.Methods.level3;

import java.util.Scanner;

public class CalendarProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);
    }

    // a. Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {"", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return months[month];
    }

    // b. Method for Leap Year check
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // b. Method to get number of days in the month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month];
    }

    // c. Method to get the first day of the month using Gregorian algorithm
    public static int getStartDay(int m, int y) {
        int d = 1; // First day of the month
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        return d0; // 0 for Sunday, 1 for Monday, etc.
    }

    public static void displayCalendar(int month, int year) {
        System.out.println("\n    " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int startDay = getStartDay(month, year);
        int numberOfDays = getDaysInMonth(month, year);

        // d. First loop for initial indentation (3 spaces per day)
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // d. Second loop to display days
        for (int i = 1; i <= numberOfDays; i++) {
            System.out.printf("%3d ", i);

            // Move to next line after Saturday (if the day is the 7th column)
            if (((i + startDay) % 7 == 0) || (i == numberOfDays)) {
                System.out.println();
            }
        }
    }
}
