package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void containsDigits_returnsTrue_whenInputIsDigit() {
        String input = "Hello324";
        boolean actual = Main.containsDigits(input);
        assertTrue(actual);
    }

    @Test
    public void isLongEnough_ReturnsTrue_whenInputIsEqualTo8() {
        String input = "Hello324";
        boolean actual = Main.isLongEnough(input);
        assertTrue(actual);
    }

    @Test
    public void isLongEnough_ReturnsTrue_whenInputIsLongerThan8() {
        String input = "Hello324asdf";
        boolean actual = Main.isLongEnough(input);
        assertTrue(actual);
    }

    @Test
    public void isLongEnough_ReturnsFalse_whenInputIsShorterThan8() {
        String input = "Hi";
        boolean actual = Main.isLongEnough(input);
        assertFalse(actual);
    }




}