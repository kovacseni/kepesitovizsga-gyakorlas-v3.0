package hu.nive.ujratervezes.kepesitovizsga.uppercase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperCaseLetters {

    public int getNumberOfUpperCase(String filename) {
        int numberOfUpperCaseLetters = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(UpperCaseLetters.class.getResourceAsStream("/" + filename)))) {
            String line;
            while ((line = br.readLine()) != null) {
                numberOfUpperCaseLetters += countUpperCaseLetters(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
        return numberOfUpperCaseLetters;
    }

    private int countUpperCaseLetters(String line) {
        int count = 0;
        char[] charsOfLine = line.toCharArray();
        for (char c : charsOfLine) {
            if (Character.isLetter(c) && Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}
