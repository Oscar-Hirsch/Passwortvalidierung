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

    public static boolean containsCapitalAndSmallLetter(String s) {
        boolean hasCapitalLetter = false;
        boolean hasSmallLetter = false;
        for (char a: s.toCharArray()) {
            if (Character.isUpperCase(a)) {
                hasCapitalLetter = true;
            } else if (Character.isLowerCase(a)) {
                hasSmallLetter = true;
            }
        }
        return hasCapitalLetter && hasSmallLetter;
    }
}