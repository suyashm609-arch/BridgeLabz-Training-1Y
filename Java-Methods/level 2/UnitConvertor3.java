package com.gla.Methods.level2;

public class UnitConvertor3 {

    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println("100F to Celsius: " + convertFahrenheitToCelsius(100));
        System.out.println("37C to Fahrenheit: " + convertCelsiusToFahrenheit(37));
        System.out.println("10 pounds to kg: " + convertPoundsToKilograms(10));
        System.out.println("5 kg to pounds: " + convertKilogramsToPounds(5));
        System.out.println("2 gallons to liters: " + convertGallonsToLiters(2));
        System.out.println("5 liters to gallons: " + convertLitersToGallons(5));
    }
}
