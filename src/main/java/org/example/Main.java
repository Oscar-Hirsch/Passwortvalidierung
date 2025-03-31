package org.example;

public class Main {
    public static void main(String[] args) {
        boolean item = specialChars("<hello>");

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
        for (char a : s.toCharArray()) {
            if (Character.isUpperCase(a)) {
                hasCapitalLetter = true;
            } else if (Character.isLowerCase(a)) {
                hasSmallLetter = true;
            }
        }
        return hasCapitalLetter && hasSmallLetter;
    }

    public static boolean uniquePassword(String password) {
        String[] pawned_passwords = {"Password", "qwerasdf", "hallo123", "thisisapassword", "1234567890"};
        for (String s : pawned_passwords) {
            if (password.equalsIgnoreCase(s)) return false;

        }
        return true;
    }

    public static boolean specialChars(String password) {
        for (char a : password.toCharArray()) {

            if (a >= '!' && a <= '/') {
                return true;
            } else if (a >= ':' && a <= '@') {
                return true;
            } else if (a >= '[' && a <= '`') {
                return true;
            } else if (a >= '{' && a <= '~') {
                return true;
            }
        }
        return false;
    }
}