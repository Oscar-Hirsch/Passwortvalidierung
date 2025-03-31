package org.example;

public class Main {
    public static void main(String[] args) {

    }
    public static boolean containsDigits(String s) {
        boolean result = false;
        for (char a : s.toCharArray()) {
            if (Character.isDigit(a)) {
                result = true;
            }
        }
        return result;
    }

    public static boolean isLongEnough(String s) {
        int minimalLength = 8;
        return s.length() >= minimalLength;
    }

    public static boolean containsCapitalLetter(String s) {
        for (char a: s.toCharArray()) {
            if (Character.isUpperCase(a)) {
                return true;
            }
        }
        return false;
    }
}