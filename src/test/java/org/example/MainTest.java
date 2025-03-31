package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void containsDigits_returnsTrue_whenInputIsDigit() {
        String input = "Hello324";
        boolean actual = Main.containsDigits(input);
        assertTrue(actual);
    }

    @Test
    void isLongEnough_ReturnsTrue_whenInputIsEqualTo8() {
        String input = "Hello324";
        boolean actual = Main.isLongEnough(input);
        assertTrue(actual);
    }

    @Test
    void isLongEnough_ReturnsTrue_whenInputIsLongerThan8() {
        String input = "Hello324asdf";
        boolean actual = Main.isLongEnough(input);
        assertTrue(actual);
    }

    @Test
    void isLongEnough_ReturnsFalse_whenInputIsShorterThan8() {
        String input = "Hi";
        boolean actual = Main.isLongEnough(input);
        assertFalse(actual);
    }

    @Test
    void containsCapitalAndSmallLetter_returnsTrue_whenInputContainsCapitalAndSmallLetter() {
        String input = "Hello324";
        boolean actual = Main.containsCapitalAndSmallLetter(input);
        assertTrue(actual);
    }

    @Test
    void containsCapitalAndSmallLetter_returnsFalse_whenInputContainsNoSmallLetter() {
        String input = "HELLIJDFDO242%§$&/";
        boolean actual = Main.containsCapitalAndSmallLetter(input);
        assertFalse(actual);

    }

    @Test
    void containsCapitalAndSmallLetter_returnsFalse_whenInputContainsNoCapitalLetter() {
        String input = "hellofasf234!§$%&/(!)";
        boolean actual = Main.containsCapitalAndSmallLetter(input);
        assertFalse(actual);
    }

    @Test
    void uniquePassword_returnsTrue_whenInputIsUnique() {
        String input = "Ouhasd9234uioi98";
        boolean actual = Main.uniquePassword(input);
        assertTrue(actual);
    }

    @Test
    void uniquePassword_returnsFalse_whenInputIsNotUnique() {
        String input = "password";
        boolean actual = Main.uniquePassword(input);
        assertFalse(actual);
    }






}