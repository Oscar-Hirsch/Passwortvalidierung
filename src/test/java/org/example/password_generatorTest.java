package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Password_generatorTest {

    @Test
    void isSpecialChar_returnsTrue_whenInputIsSpecialChar() {
        char input = '&';
        assertTrue(password_generator.isSpecialChar(input));
    }

    @Test
    void isSpecialChar_returnsFalse_whenInputIsNotSpecialChar() {
        char input = 'A';
        assertFalse(password_generator.isSpecialChar(input));
    }

}