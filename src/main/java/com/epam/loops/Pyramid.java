package com.epam.loops;

public class Pyramid {

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

    public void printPyramid(int cathetusLength) {
        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= cathetusLength; i++) {
            printSpaces(output, cathetusLength - i);
            printNumbersAscending(output, i);
            printNumbersDescending(output, i);
            output.append(System.lineSeparator());
        }
        System.out.print(output);
    }

    private void printSpaces(StringBuilder output, int count) {
        output.append(" ".repeat(Math.max(0, count)));
    }

    private void printNumbersAscending(StringBuilder output, int count) {
        for (int i = count; i >= 1; i--) {
            output.append(i);
        }
    }

    private void printNumbersDescending(StringBuilder output, int count) {
        for (int i = 2; i <= count; i++) {
            output.append(i);
        }
    }
}
