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
        if (s.length() < minimalLength) return false;
        return true;
    }
}