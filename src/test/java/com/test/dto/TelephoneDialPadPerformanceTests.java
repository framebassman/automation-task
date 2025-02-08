package com.test.dto;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class TelephoneDialPadPerformanceTests {
    private StringBuilder input = new StringBuilder();

    @Test
    public void cannotProcessInputWithLengthMoreThan16Symbols() {
        for (int i = 0; i < Math.pow(2, 4) + 2; i++) {
            input.append(i);
        }

        assertThrows(OutOfMemoryError.class, () -> TelephoneDialPad.retrieveCombinations(input.toString()));
    }
}
