package com.test.dto;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TelephoneDialPadValidInputsTests {
    @Test
    public void verifies0ButtonGives0AsCombination() {
        assertThat(TelephoneDialPad.retrieveCombinations("0"), equalTo(List.of("0")));
    }

    @Test
    public void verifies1ButtonGives1AsCombination() {
        assertThat(TelephoneDialPad.retrieveCombinations("1"), equalTo(List.of("1")));
    }

    @Test
    public void verifies2ButtonGivesABCAsCombination() {
        assertThat(TelephoneDialPad.retrieveCombinations("2"), equalTo(List.of("A", "B", "C")));
    }

    @Test
    public void verifies3ButtonGivesDEFAsCombination() {
        assertThat(TelephoneDialPad.retrieveCombinations("3"), equalTo(List.of("D", "E", "F")));
    }

    @Test
    public void verifies4ButtonGivesGHIAsCombination() {
        assertThat(TelephoneDialPad.retrieveCombinations("4"), equalTo(List.of("G", "H", "I")));
    }

    @Test
    public void verifies5ButtonGivesJKLAsCombination() {
        assertThat(TelephoneDialPad.retrieveCombinations("5"), equalTo(List.of("J", "K", "L")));
    }

    @Test
    public void verifies6ButtonGivesMNOAsCombination() {
        assertThat(TelephoneDialPad.retrieveCombinations("6"), equalTo(List.of("M", "N", "O")));
    }

    @Test
    public void verifies7ButtonGivesPQRSAsCombination() {
        assertThat(TelephoneDialPad.retrieveCombinations("7"), equalTo(List.of("P", "Q", "R", "S")));
    }

    @Test
    public void verifies8ButtonGivesTUVAsCombination() {
        assertThat(TelephoneDialPad.retrieveCombinations("8"), equalTo(List.of("T", "U", "V")));
    }

    @Test
    public void verifies9ButtonGivesWXYZAsCombination() {
        assertThat(TelephoneDialPad.retrieveCombinations("9"), equalTo(List.of("W", "X", "Y", "Z")));
    }

    @Test
    public void verifies2DigitsWithOneOptionGivesOneCombination() {
        assertThat(TelephoneDialPad.retrieveCombinations("00"), equalTo(List.of("00")));
    }

    @Test
    public void verifies2DigitsWithSeveralOptionGivesSeveralCombinations() {
        assertThat(
                TelephoneDialPad.retrieveCombinations("22"),
                equalTo(
                        List.of(
                                "AA", "AB", "AC",
                                "BA", "BB", "BC",
                                "CA", "CB", "CC"
                        )
                )
        );
    }

    @Test
    public void verifies1DigitWithOneOptionAnd1DigitWithSeveralOptionsGivesSeveralCombinations() {
        assertThat(TelephoneDialPad.retrieveCombinations("02"), equalTo(List.of("0A", "0B", "0C")));
    }
}
