package com.epam.loops;

public class HalfPyramid {

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

    public void printHalfPyramid(int cathetusLength) {
        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= cathetusLength; i++) {
            printSpaces(output, cathetusLength - i);
            printNumbersAscending(output, i);
            output.append(System.lineSeparator());
        }
        System.out.print(output);
    }

    private void printSpaces(StringBuilder output, int count) {
        output.append(" ".repeat(Math.max(0, count)));
    }

    private void printNumbersAscending(StringBuilder output, int count) {
        output.append("*".repeat(Math.max(0, count)));
    }
}
