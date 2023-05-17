package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int first = number % 10;
        number/=10;
        int second = number % 10;
        number/=10;
        int third = number % 10;
        number/=10;
        int fourd = number %10;
        System.out.println(first + second + third + fourd);
    }

}
