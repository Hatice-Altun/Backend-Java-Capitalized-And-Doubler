package com.altun.Java;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// Example capitalized and doubler

        capitalizedAndPrint("Frontend Development");
        capitalizedAndPrint("Backend Development");

        doubler(10);
        System.out.println("Double is 100: is " + doubler(100));
        int outcome = doubler(1000) + 22;
        System.out.println("Thousand is doubled + is: " + outcome);
    }

    public static void capitalizedAndPrint(String input) {
        String capitalized = input.toUpperCase();
        System.out.println("Everything capitalized: " + capitalized);
    }

    public static int doubler(int cijfer) {
        int outcome = cijfer * 2;
        return outcome;
    }
}
