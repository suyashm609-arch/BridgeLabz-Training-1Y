package com.gla.Methods.level3;

import java.util.Scanner;

public class CollinearPoints {

    public static void main(String[]args ) {
        Scanner sc = new Scanner(System.in);

        // a. Take inputs for 3 points
        System.out.println("Enter coordinates for A (x1 y1): ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        System.out.println("Enter coordinates for B (x2 y2): ");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        System.out.println("Enter coordinates for C (x3 y3): ");
        double x3 = sc.nextDouble(), y3 = sc.nextDouble();

        System.out.println("\n--- Results ---");
        checkCollinearBySlope(x1, y1, x2, y2, x3, y3);
        checkCollinearByArea(x1, y1, x2, y2, x3, y3);
    }

    // b. Method using the Slope Formula
    public static void checkCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Slope formula: (y2 - y1) / (x2 - x1)
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        if (slopeAB == slopeBC && slopeBC == slopeAC) {
            System.out.println("Slope Method: Points are Collinear.");
        } else {
            System.out.println("Slope Method: Points are NOT Collinear.");
        }
    }

    // c. Method using the Area of Triangle Formula
    public static void checkCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Area = 0.5 * |x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)|
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        if (area == 0) {
            System.out.println("Area Method: Points are Collinear (Area is 0).");
        } else {
            System.out.println("Area Method: Points are NOT Collinear (Area is " + area + ").");


        }
    }
}