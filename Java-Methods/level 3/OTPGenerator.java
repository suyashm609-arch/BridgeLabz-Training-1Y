package com.gla.Methods.level3;

public class OTPGenerator {

    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static void main(String[] args) {
        int[] otp = new int[10];

        for (int i = 0; i < 10; i++) {
            otp[i] = generateOTP();
            System.out.println(otp[i]);
        }
    }
}
