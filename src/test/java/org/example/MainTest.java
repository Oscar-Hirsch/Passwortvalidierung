package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void containsDigits_returnsTrue_when_input_is_digit() {
        String input = "Hello324";
        boolean actual = Main.containsDigits(input);
        assertTrue(actual);
    }


}