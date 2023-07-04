package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int digit = 0;
        StringBuilder revert = new StringBuilder();
        while (number > 0){
            digit = number % 10;
            revert.append(digit);
            number /= 10;
        }
        System.out.println(revert);
    }

}
