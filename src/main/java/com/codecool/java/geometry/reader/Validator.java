package com.codecool.java.geometry.reader;

public class Validator {
    public Validator() {}

    public boolean validateString(String input) {
        return !input.isBlank();
    }

    public boolean isNumeric(String input) {
        return input.matches("[\\d]+");
    }

    public boolean isNumberInRange(int start, int end, int input) {
        return (start <= input && input <= end);
    }
}