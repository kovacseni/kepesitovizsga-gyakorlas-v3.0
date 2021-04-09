package hu.nive.ujratervezes.kepesitovizsga.uppercase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UpperCaseLettersTest {

    @Test
    public void testGetNumberOfUpperCase() {
        Assertions.assertEquals(8, new UpperCaseLetters().getNumberOfUpperCase("characters.txt"));
    }
}