package com.test.dto;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class TelephoneDialPadInvalidInputsTests {
    @Test
    public void lettersOrSymbolsFromKeyboardReturnsException() {
        assertThrows(NumberFormatException.class, () -> TelephoneDialPad.retrieveCombinations("a"));
        assertThrows(NumberFormatException.class, () -> TelephoneDialPad.retrieveCombinations("_"));
    }

    @Test
    public void emptyStringReturnsException() {
        assertThrows(StringIndexOutOfBoundsException.class, () -> TelephoneDialPad.retrieveCombinations(""));
    }

    @Test
    public void nullReturnsException() {
        assertThrows(NullPointerException.class, () -> TelephoneDialPad.retrieveCombinations(null));
    }
}
